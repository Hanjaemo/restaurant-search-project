package project.restaurant.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.restaurant.repository.RestSearchCond;

@Slf4j
@Controller
@RequestMapping()
public class BasicController {

    @GetMapping("/location")
    public String location() {
        return "main/location";
    }


}
