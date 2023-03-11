package project.restaurant.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class BasicController {

    @GetMapping("/page1")
    public String location() {
        return "html/page1";
    }


}
