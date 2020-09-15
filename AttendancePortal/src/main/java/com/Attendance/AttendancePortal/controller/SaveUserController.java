package com.Attendance.AttendancePortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Attendance.AttendancePortal.business.bean.UserBean;
import com.Attendance.AttendancePortal.service.AttendanceService;

@Controller
public class SaveUserController {
	
	@Autowired
	private AttendanceService service;
	
	@GetMapping("loadUser")
	public ModelAndView loadUser() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserRegistration");
		mv.addObject("userObj", new UserBean());
		return mv;
	}
	@PostMapping("saveUser")
	public ModelAndView saveUser(@ModelAttribute("userObj")UserBean bean) {
		
		ModelAndView mv =new ModelAndView();
		service.saveLogin(bean);
		service.saveDailReportName(bean.getName());
		mv.setViewName("RegistrationSuccess");
		mv.addObject("message", "Name :"+bean.getName()+"\nEnterpriseId :"+bean.getEnterpriseId()
						+"\nEmployeeID :"+bean.getEmployeeId());
		
		return mv;
	}

}
