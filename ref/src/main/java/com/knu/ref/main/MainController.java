package com.knu.ref.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/ingred")
	public String ingred() {
		return "ingred";
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
