package com.safa.savetravelsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.safa.savetravelsModels.Travelmodel;
import com.safa.savetravelsServices.Travelservice;

import ch.qos.logback.core.model.Model;
import jakarta.validation.Valid;

@Controller
public class TravelController {
	@Autowired
	private Travelservice travelserv;
	
	
	@GetMapping("/")
	public String home(@ModelAttribute("travel") Travelmodel travel , Model model) {
		List<Travelmodel> allTravel = travelserv.allTravel();
		model.addAttribute("travelModel", travelModel);
		return "Form.jsp";
	}
	@PostMapping("/travel/processForm")
	public String createTravel(@Valid @ModelAttribute("travel") Travelmodel travel, BindingResult result , Model model) {
		if (result.hasErrors()) {
			List<Travelmodel> allTravel = travelserv.allTravel();
			model.addAttribute("allTravel",allTravel);
			return "Form.jsp";
		}
		else {
			travelserv.createTravel(travel);
			return "redirect:/";
		}
		
	}
	@GetMapping("/{id}")
	public String findOneTravelById(@PathVariable("id") Long id, Model model) {
		Travelmodel selectedTravel = travelserv.findTravel(id);
		model.addAttribute("travel",selectedTravel);
		return "Show.jsp";
	}
	
	@DeleteMapping("/{id}")
	public String deleteTravel(@PathVariable("id") Long id) {
		travelserv.deletTravel(id);
		return "redirect:/";
	}
	@GetMapping("/travels/edit/{id}")
	public String edit(Model model , @PathVariable("id") Long id) {
		Travelmodel selectedTravel = travelserv.findTravel(id);
		model.addAttribute("travel",selectedTravel);
		return "Edit.jsp";
	}
	@PostMapping("/travels/edit/{id}")
	public String edittrav(@Valid @ModelAttribute("travel") Travelmodel travel, BindingResult result , Model model) {
		if (result.hasErrors()) {
			return "Edit.jsp";
		}
		else {
			travelserv.createTravel(travel);
			return "redirect:/";
		}
		
	}
}
