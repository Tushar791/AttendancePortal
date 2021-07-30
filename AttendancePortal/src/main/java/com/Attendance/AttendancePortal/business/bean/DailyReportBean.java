package com.Attendance.AttendancePortal.business.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyReportBean {
	
	
	@Override
	public String toString() {
		return "DailyRe portBean [slNo=" + slNo + ", name=" + name + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", date=" + date + ", activity=" + activity + "]";
	}
	private Integer slNo;
	private String name;
	private LocalDateTime inTime;
	private LocalDateTime outTime;
	private LocalDate date;
	private String activity;
	public Integer getSlNo() {
		return slNo;
	}
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getInTime() {
		return inTime;
	}
	public void setInTime(LocalDateTime inTime) {
		this.inTime= inTime;
	}
	public LocalDateTime getOutTime() {
		return outTime;
	}
	public void setOutTime(LocalDateTime outTime) {
		this.outTime =outTime;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}

	
	

}
