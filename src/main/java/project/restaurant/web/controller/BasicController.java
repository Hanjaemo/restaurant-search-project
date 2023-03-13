package project.restaurant.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.restaurant.domain.User;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping()
@RequiredArgsConstructor
public class BasicController {

    private final User user;

    @GetMapping("/location")
    public String location() {
        return "main/location";
    }

/*
    @PostMapping("/single")
    public String single(@ModelAttribute List<Integer> location, Model model) {
        user.setLocation(location);
        model.addAttribute("location", location);
        return "main/single";
    }
*/

    @ModelAttribute("locationMap")
    public Map<Integer, String> locationMap() {
        Map<Integer, String> locationMap = new LinkedHashMap<>();
        locationMap.put(1, "1 구역");
        locationMap.put(2, "2 구역");
        locationMap.put(3, "3 구역");
        return locationMap;
    }
}
