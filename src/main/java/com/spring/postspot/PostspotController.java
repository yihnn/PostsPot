package com.spring.postspot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostspotController {

	@GetMapping("/mainHome")
	public ModelAndView mainHome() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("postspot/mainHome");
		
		return mav;
	}

}
