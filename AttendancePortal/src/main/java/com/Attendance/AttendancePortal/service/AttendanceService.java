package com.Attendance.AttendancePortal.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Attendance.AttendancePortal.business.bean.DailyReportBean;
import com.Attendance.AttendancePortal.business.bean.UserBean;

@Service
public interface AttendanceService {
	
	void saveLogin(UserBean bean);
	UserBean findByEnterpriseId(UserBean bean);
	DailyReportBean findByDailyReportName(String Name);
	DailyReportBean saveIntimeReport(DailyReportBean bean);
	void saveDailReportName(String name);
	boolean verifyToRegisterInTime(DailyReportBean bean);
	boolean verifyToRegisterOutTime(DailyReportBean bean);
	DailyReportBean saveOutTimeReport(DailyReportBean bean);
	DailyReportBean findByDailyReportNameAndDate(String name, LocalDate now);
	List<DailyReportBean> findAllDailyReports();

}
