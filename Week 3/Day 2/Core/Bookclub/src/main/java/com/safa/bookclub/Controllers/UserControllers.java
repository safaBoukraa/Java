package com.safa.bookclub.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.safa.bookclub.Modells.LoginUser;
import com.safa.bookclub.Modells.User;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserControllers {

	    // Add once service is implemented:
	     @Autowired
	     private UserService userServ;
	    @GetMapping("/")
	    public String home(Model model) {
	        // Bind empty User and LoginUser objects to the JSP
	        // to capture the form input
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "home.jsp";
	    }


    }

	    

	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {

	        // TO-DO Later -- call a register method in the service 
	        // to do some extra validations and create a new user!
	        userServ.register(newUser, result);
	        if(result.hasErrors()) {
	            // Be sure to send in the empty LoginUser before 
	            // re-rendering the page.
	            model.addAttribute("newLogin", new LoginUser());
	            return "home.jsp";
	        }
	        
	        // No errors! 
	        // TO-DO Later: Store their ID from the DB in session, 
	        // in other words, log them in.
	        session.setAttribute("user_id", newUser.getId());
	        return "redirect:/books";
	    }
	    
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        // Add once service is implemented:
	         User user = userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "home.jsp";
	        }
	    
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/books";
	    }
	    
	    @GetMapping("/logout")
	    public String logout(HttpSession s) {
	    	s.invalidate();
	    	return "redirect:/";
	    }
	  
	}