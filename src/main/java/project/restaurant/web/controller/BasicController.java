package project.restaurant.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class BasicController {

    @GetMapping("/location")
    public String location() {
        System.out.println("BasicController.location");
        return "location";
    }


}
