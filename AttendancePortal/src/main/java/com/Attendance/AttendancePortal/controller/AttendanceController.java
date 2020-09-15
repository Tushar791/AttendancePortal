
package com.Attendance.AttendancePortal.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Attendance.AttendancePortal.business.bean.DailyReportBean;
import com.Attendance.AttendancePortal.business.bean.UserBean;
import com.Attendance.AttendancePortal.service.AttendanceService;

@Controller
public class AttendanceController {

	@Autowired
	private AttendanceService service;
	
	static String name;

	@GetMapping("loadLogin")
	public ModelAndView loadLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		System.out.println("Load login");
		mv.addObject("loginObj", new UserBean());
		mv.addObject("message", " ");
		mv.addObject("reportBean", new DailyReportBean());
		
		return mv;
	}

	@PostMapping("loginPage")
	public ModelAndView insertdetails(@ModelAttribute("loginObj")UserBean bean,BindingResult result) {
	
		ModelAndView mv = new ModelAndView();
	if(result.hasErrors()) {
			mv.setViewName("loginPage");
		}else {UserBean verify = service.findByEnterpriseId(bean);
		DailyReportBean reportBean = null;
		if(verify!=null){
			name = verify.getName();
			if(service.verifyToRegisterInTime(service.findByDailyReportName(verify.getName()))) {
				reportBean = service.findByDailyReportName(verify.getName());
				reportBean.setDate(LocalDate.now());
				reportBean.setInTime(LocalDateTime.now());
				reportBean.setName(verify.getName());
				service.saveIntimeReport(reportBean);
				mv.setViewName("inTime");
				mv.addObject("message", "Hi, "+reportBean.getName()+" your in time has been registered");
			}else if(service.verifyToRegisterOutTime(service.findByDailyReportName(verify.getName()))) {
				reportBean = service.findByDailyReportName(verify.getName());
				System.out.println(reportBean);
				System.out.println("out time reg");
				mv.setViewName("inTime");
				
			}
			
		}else{
			mv.setViewName("login");
			mv.addObject("message", "Wrong Password\n Please try again!!");
		}}
		
		return mv;
	}
	@PostMapping("addOutTimeAndActivity")
	public ModelAndView registerOutTime(@ModelAttribute("reportBean")DailyReportBean bean) {
		ModelAndView mv = new ModelAndView();
		DailyReportBean bean2= service.findByDailyReportNameAndDate(name,LocalDate.now());
		bean2.setOutTime(LocalDateTime.now());
		bean2.setActivity(bean.getActivity());
		service.saveOutTimeReport(bean2);
		
		mv.setViewName("outTime");
		mv.addObject("message", "Hi, "+bean2.getName()+" ,your out time and activity has been registered");
		return mv;
	}
	 
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleAllException(Exception exception) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("GereralisedExceptionHandlerPage");
		mv.addObject("message", exception.getStackTrace());
		return mv;
	}

}
