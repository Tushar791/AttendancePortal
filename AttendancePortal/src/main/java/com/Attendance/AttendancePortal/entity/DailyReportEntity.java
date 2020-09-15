package com.Attendance.AttendancePortal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DailyReport")
public class DailyReportEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name= "slNo")
		private Integer slNo;
		@Column(name = "name")
		private String name;
		@Column(name = "inTime")
		private LocalDateTime inTime;
		@Column(name = "outTime")
		private LocalDateTime outTime;
		@Column(name = "date")
		private LocalDate date;
		@Column(name ="Activity")
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
			this.inTime = inTime;
		}
		public LocalDateTime getOutTime() {
			return outTime;
		}
		public void setOutTime(LocalDateTime outTime) {
			this.outTime = outTime;
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
