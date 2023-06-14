package com.spring.postspot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@GetMapping("/addSpot")
	public ModelAndView getAddspot() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("postspot/write");
		return mav;
		
	}
	
	@PostMapping("/addSpot")
	public ModelAndView postAddspot(HttpServletRequest req) {
	
		ModelAndView mav = new ModelAndView();
		
		System.out.println(req.getParameter("content"));
		System.out.println(req.getParameter("spotName"));
		System.out.println(req.getParameter("address"));
		System.out.println(req.getParameter("city"));
		System.out.println(req.getParameter("place"));
		
		mav.setViewName("redirect:/mainHome");
		return mav;
		
	}
	
}
