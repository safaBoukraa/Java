package com.safa.daikichipathControllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class daikichiController {

@GetMapping("/daikichi")
public String daikichi () {
	return "Welcome";
}

@GetMapping("/daikichi/travel/{city}")
public String city (@PathVariable("city") String city) {
	return "Congratulations! You will soon travel to "+ city + "!";
}
	
@GetMapping ("/daikichi/lotto/{number}")
public String number (@PathVariable("number") int number) {
	if(number % 2 ==0) {
		return "You will take a grand journey in the near future, but be weary of tempting offers";
	}
	else {
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}
	
}