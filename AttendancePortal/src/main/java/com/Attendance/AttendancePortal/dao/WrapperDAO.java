package com.Attendance.AttendancePortal.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Attendance.AttendancePortal.business.bean.DailyReportBean;
import com.Attendance.AttendancePortal.business.bean.UserBean;
import com.Attendance.AttendancePortal.entity.DailyReportEntity;
import com.Attendance.AttendancePortal.entity.LoginEntity;


@Repository
public class WrapperDAO {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@Autowired
	private DailyReportDAO dailyReportDAO;
	
	public UserBean saveUser(UserBean bean) {
		LoginEntity entity = loginBeantoEntity(bean);
		loginDAO.save(entity);
		return bean;
	}
	
	public UserBean findbyEnterpriseId(String enterpriseId) {
		LoginEntity entity = loginDAO.findByEnterpriseId(enterpriseId);
		UserBean bean = loginEntitytoBean(entity);
		return bean;
	}
	
	public UserBean loginEntitytoBean(LoginEntity entity) {
		UserBean bean = new UserBean();
		bean.setEmployeeId(entity.getEmployeeId());
		bean.setEnterpriseId(entity.getEnterpriseId());
		bean.setName(entity.getName());
		return bean;
	}
	
	public LoginEntity loginBeantoEntity(UserBean bean) {
		LoginEntity entity= new LoginEntity();
		entity.setEmployeeId(bean.getEmployeeId());
		entity.setEnterpriseId(bean.getEnterpriseId());
		entity.setName(bean.getName());
		return entity;
	}
	public DailyReportBean dailyReportEntitytoBean(DailyReportEntity entity) {
		DailyReportBean bean = new DailyReportBean();
		bean.setSlNo(entity.getSlNo());
		bean.setName(entity.getName());
		bean.setInTime(entity.getInTime());
		bean.setOutTime(entity.getOutTime());
		bean.setDate(entity.getDate());
		bean.setActivity(entity.getActivity());
		return bean;
	}
	public DailyReportEntity dailyReportBeantoEntity(DailyReportBean bean) {
		DailyReportEntity entity = new DailyReportEntity();
		entity.setSlNo(bean.getSlNo());
		entity.setName(bean.getName());
		entity.setInTime(bean.getInTime());
		entity.setOutTime(bean.getOutTime());
		entity.setDate(bean.getDate());
		entity.setActivity(bean.getActivity());
		return entity;
	}

	public DailyReportBean saveReport(DailyReportBean bean) {
		DailyReportEntity entity = dailyReportBeantoEntity(bean);
		dailyReportDAO.save(entity);
		bean.setSlNo(entity.getSlNo());
		return bean;
	}
	 public DailyReportBean findByName(String name) {
		 DailyReportEntity entity = dailyReportDAO.findByName(name);
		 return dailyReportEntitytoBean(entity);
		 
	 }
	 public void save(String Name) {
		 DailyReportEntity entity= new DailyReportEntity();
		 entity.setName(Name);
		 dailyReportDAO.save(entity);
	 }
	 public DailyReportBean findaByNameAndDate(String Name, LocalDate date) {
		 DailyReportEntity entity = dailyReportDAO.findByNameAndDate(Name, date);
		 DailyReportBean bean = dailyReportEntitytoBean(entity);
		 return bean;
	 }

	public List<DailyReportBean> findAllDailyReports() {
		List<DailyReportEntity> listEntity = dailyReportDAO.findAll();
		List<DailyReportBean> listBean = new ArrayList<DailyReportBean>();
		DailyReportBean bean = new DailyReportBean();
		for(DailyReportEntity entity: listEntity) {
			bean= dailyReportEntitytoBean(entity);
			listBean.add(bean);
		}
		return listBean;
	}
	

}
