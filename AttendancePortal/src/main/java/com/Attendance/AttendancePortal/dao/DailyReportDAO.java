package com.Attendance.AttendancePortal.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Attendance.AttendancePortal.entity.DailyReportEntity;

public interface DailyReportDAO extends JpaRepository<DailyReportEntity, Integer> {
	
	DailyReportEntity findByNameAndDate(String name, LocalDate date);
	DailyReportEntity findByName(String name);

}
