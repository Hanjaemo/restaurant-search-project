package project.restaurant.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic/test")
public class BasicController {

    @GetMapping()
    public String test() {
        return "지도 ㅎㅇ";
    }


}
