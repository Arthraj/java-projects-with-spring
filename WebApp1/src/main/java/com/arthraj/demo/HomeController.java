package com.arthraj.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("home")
	@ResponseBody
	public String Home() {
		System.out.println("Hello, I'm Home");
		return "home.jsp";
	}
}
