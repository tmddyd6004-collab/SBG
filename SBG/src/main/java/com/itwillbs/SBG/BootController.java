package com.itwillbs.SBG;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test() throws Exception {
		//기능1번구현
		//깃허브에서 1번기능 수정하기
		//로컬에서 2번 추가
		return "test";
		
	}

}

