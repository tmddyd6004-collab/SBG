package com.itwillbs.SBG;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test() throws Exception {
		
		return "test";
		
	}

}
