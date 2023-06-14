package com.spring.postspot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostspotController {

	@GetMapping("/mainHome")
	public ModelAndView mainHome() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("postspot/mainHome");
		
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("postspot/login");
		
		return mav;
	}

	@PostMapping("/login_ok")
	public ModelAndView loginOk(){
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("redirect:/mainHome");
		
		return mav;
	}
	
	@GetMapping("/createAccount")
	public ModelAndView createAccount() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("postspot/account");
		
		return mav;
	}
}
