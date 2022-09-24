package com.knu.ref.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("")
	public String main() {
		return "main";
	}
	

	
	@RequestMapping("/recipe")
	public String recipelist() {
		return "recipelist";
	}
	
	@RequestMapping("/input")
	public String inputIngred() {
		return "input";
	}
	
	
	
	
	
}
