package com.safaaroutes.controlers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikiController {

    @GetMapping("/daikichi")
    public String getWelcomeMessage() {
        return "Welcome!";
    }

    @GetMapping("/daikichi/today")
    public String getTodayMessage() {
        return "Today you will find luck in all your endeavors!";
    }

    @GetMapping("/daikichi/tomorrow")
    public String getTomorrowMessage() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}