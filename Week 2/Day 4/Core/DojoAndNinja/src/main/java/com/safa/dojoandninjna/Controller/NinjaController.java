package com.safa.dojoandninjna.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.safa.dojoandninjna.Models.Dojolmodel;
import com.safa.dojoandninjna.Models.Ninjamodel;
import com.safa.dojoandninjna.Services.Dojolservice;
import com.safa.dojoandninjna.Services.Ninjaservice;


import jakarta.validation.Valid;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	@Autowired
	private Ninjaservice Ninjalserv;
	@Autowired
	private Dojolservice dojolserv;
	
	
	@GetMapping("")
	public String show(@ModelAttribute("ninja") Ninjamodel ninja , Model model) {
		List<Ninjamodel> allNinjas = Ninjalserv.allNinjas();
		model.addAttribute("allNinja",allNinjas	);
		List<Dojolmodel> allDojos = dojolserv.allDojo();
		model.addAttribute("allDojos", allDojos);
		return "showall.jsp";
	}
	@GetMapping("/new")
	public String home(@ModelAttribute("ninja") Ninjamodel ninja , Model model) {
		List<Ninjamodel> allNinja = Ninjalserv.allNinjas();
		model.addAttribute("allNinja",allNinja);
		List<Dojolmodel> allDojos = dojolserv.allDojo();
		model.addAttribute("allDojos", allDojos);
		return "Ninjas.jsp";
	}
	
	
	@PostMapping("/processForm")
	public String createDojo(@Valid @ModelAttribute("ninja") Ninjamodel ninja, BindingResult result , Model model) {
		if (result.hasErrors()) {
			List<Ninjamodel> allNinja = Ninjalserv.allNinjas();
			model.addAttribute("allNinja",allNinja);
			return "Ninjas.jsp";
		}
		else {
			Ninjalserv.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	@DeleteMapping("/new/ninja/{id}")
	public String deleteTravel(@PathVariable("id") Long id) {
		Ninjalserv.deleteNinja(id);
		return "redirect:/new/ninja";
	}
}