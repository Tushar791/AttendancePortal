package com.Attendance.AttendancePortal.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Attendance.AttendancePortal.business.bean.DailyReportBean;
import com.Attendance.AttendancePortal.business.bean.UserBean;
import com.Attendance.AttendancePortal.dao.DailyReportDAO;
import com.Attendance.AttendancePortal.dao.WrapperDAO;
import com.Attendance.AttendancePortal.entity.DailyReportEntity;

@Service
public class AttendanceServiceImple implements AttendanceService {

	@Autowired
	private WrapperDAO wrapperDao;
	@Override
	public void saveLogin(UserBean bean) {
		// TODO Auto-generated method stub
		wrapperDao.saveUser(bean);
	}
	@Override
	public UserBean findByEnterpriseId(UserBean bean) {
		UserBean verify = wrapperDao.findbyEnterpriseId(bean.getEnterpriseId());
		if(verify.getEmployeeId().equals(bean.getEmployeeId()) && (verify.getEnterpriseId().equals(bean.getEnterpriseId())))
			return verify;
		else
			return null;
	}
	@Override
	public DailyReportBean saveIntimeReport(DailyReportBean bean) {
		DailyReportBean reportBean = wrapperDao.saveReport(bean);
		return reportBean;
	}
	@Override
	public DailyReportBean findByDailyReportName(String name) {
		DailyReportBean bean2=wrapperDao.findByName(name);
		return bean2;
		
	}
	@Override
	public void saveDailReportName(String name) {
		wrapperDao.save(name);
		
	}
	@Override
	public boolean verifyToRegisterInTime(DailyReportBean bean) {
		if(bean.getInTime() == null && bean.getDate()== null) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public boolean verifyToRegisterOutTime(DailyReportBean bean) {
		if(bean.getOutTime() == null && bean.getActivity() == null && bean.getDate().equals(LocalDate.now()) )
		{
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public DailyReportBean saveOutTimeReport(DailyReportBean bean) {
		DailyReportBean reportBean = wrapperDao.saveReport(bean);
		return reportBean;
	}
	@Override
	public DailyReportBean findByDailyReportNameAndDate(String name, LocalDate now) {
		return wrapperDao.findaByNameAndDate(name, now);
	}
	@Override
	public List<DailyReportBean> findAllDailyReports() {
		return wrapperDao.findAllDailyReports();
	}
	
	

}
