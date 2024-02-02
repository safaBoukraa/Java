package com.safa.FruityLoopsControllers;


	import java.util.ArrayList;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class FruityLoopsControllers{
	 
	 @GetMapping("/")
	 public String index (Model model) {
	     
	     ArrayList<iteam> fruits = new ArrayList<iteam>();
	     fruits.add(new iteam("Kiwi", 1.5));
	     fruits.add(new iteam("Mango", 2.0));
	     fruits.add(new iteam("Goji Berries", 4.0));
	     fruits.add(new iteam("Guava", .75));
	     
	     model.addAttribute("fruitsList", fruits);
	     
	     return "index.jsp";
	 }
	}

