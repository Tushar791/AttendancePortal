package com.Attendance.AttendancePortal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Attendance.AttendancePortal.business.bean.DailyReportBean;
import com.Attendance.AttendancePortal.business.bean.UserBean;
import com.Attendance.AttendancePortal.service.AttendanceService;

@Controller
public class GenerateReports {
	
	@Autowired
	private AttendanceService service;
	
	@GetMapping("genrateReport")
	public ModelAndView loadReport() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminLogin");
		mv.addObject("userObj", new UserBean());
		mv.addObject("reportobj", new DailyReportBean());
		mv.addObject("message", "Enter Admin Credentials ");
		return mv;
	}
	@PostMapping("admin")
	public ModelAndView verifyAdmin(@ModelAttribute("userObj")UserBean bean) {
		ModelAndView mv = new ModelAndView();
		if(bean.getEnterpriseId().equals("admin") && bean.getEmployeeId().equals("admin")) {
			mv.setViewName("generateReport");
			ArrayList<DailyReportBean> list = (ArrayList<DailyReportBean>) service.findAllDailyReports();
			mv.addObject("message","you will now generate reprots");
			mv.addObject("dailyReportList", list);
			return mv;
		}else {
			mv.setViewName("admin");
			mv.addObject("message", "Enter Admin credentials Correctly");
			return mv;
		}
	}
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleAllException(Exception exception) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("GereralisedExceptionHandlerPage");
		mv.addObject("message", exception.getStackTrace());
		return mv;
	}
	

}
