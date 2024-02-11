package com.safa.dojoandninjna.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.safa.dojoandninjna.Models.Dojolmodel;
import com.safa.dojoandninjna.Services.Dojolservice;


import jakarta.validation.Valid;
import org.springframework.ui.Model;





@Controller
@RequestMapping("/dojos")
public class DojoController {
	@Autowired
	private Dojolservice dojolserv;

    @GetMapping("")


    public String home(@ModelAttribute("dojo") Dojolmodel dojo, Model model) {
    	List<Dojolmodel> allDojos = dojolserv.allDojo();
		 model.addAttribute("allDojos", allDojos);

        return "Dojos.jsp";
    }
    @PostMapping("/processForm")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojolmodel dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Dojos.jsp";
        } else {
            dojolserv.createDojo(dojo);
            return "redirect:/dojos";
        }
    }
}
