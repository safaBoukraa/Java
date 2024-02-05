package com.safa.omikujiformControllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class formController {
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/process")
	public String process(@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("prof") String prof,
			@RequestParam("thing") String thing,
			@RequestParam("someNice") String someNice,
			HttpSession session)
			{	
				session.setAttribute("keynumber", number);
				session.setAttribute("keycity", city);
				session.setAttribute("keyname", name);
				session.setAttribute("keyprof", prof);
				session.setAttribute("keything", thing);
				session.setAttribute("keysomeNice", someNice);
				return "redirect:/omikuji/show";
			}
	    
	    	
	@GetMapping("/omikuji/show")
	public String show () {
	return "show.jsp";
	}
	
	    
	}

