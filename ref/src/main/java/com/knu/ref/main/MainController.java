package com.knu.ref.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class MainController {

	@RequestMapping("main")
	public String main() {
		return "main";
	}
	

	
	@RequestMapping("main/recipe")
	public String recipelist() {
		return "recipelist";
	}
	
	@RequestMapping("main/input")
	public String inputIngred() {
		return "input";
	}
	
	@RequestMapping("/")
    public String root() {
        return "redirect:/main";
    }
	
	
	
	
	
}
