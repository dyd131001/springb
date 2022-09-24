package com.knu.ref.ingred;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
@RequestMapping("/main/ingred")
public class IngredController {
	private final IngredService ingredService;
	
	@RequestMapping("")
	public String ingred(Model model) {
		List<Ingred> ingredList = this.ingredService.getList();
        model.addAttribute("ingredList", ingredList);
		return "ingred";
	}
	
	@RequestMapping("/input")
	public String InputIngred() {
		System.out.println("여기왓을걸?\n");
		return "input";
	}
	
	@PostMapping("/input")
	public String createIngred(Model model,@RequestParam String ingredient) {
		this.ingredService.create(ingredient);
		return "main";
	}
	
	
}