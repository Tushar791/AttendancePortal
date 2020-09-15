package com.Attendance.AttendancePortal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Attendance.AttendancePortal.entity.LoginEntity;

@Repository
public interface LoginDAO extends JpaRepository<LoginEntity, Integer> {
	
	LoginEntity findByEnterpriseId(String enterpriseId);
	
	
}
