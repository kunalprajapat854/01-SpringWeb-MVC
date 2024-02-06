package in.kunal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getmsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Welcome to our website !");
		mv.setViewName("index");
		return mv;
	}
	
	
	@GetMapping("/info")
	public ModelAndView user() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", "Kunal Prajapat");
		mav.addObject("age", 20);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/Hi")
     public ModelAndView first() {
    	 ModelAndView  mv = new ModelAndView();
    	 mv.addObject("key", "Spring Web MVC");
    	 mv.setViewName("index");
    	 return mv;
     }

}
