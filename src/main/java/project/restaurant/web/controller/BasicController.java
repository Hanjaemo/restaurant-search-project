package project.restaurant.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.restaurant.domain.Rest;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping()
@RequiredArgsConstructor
public class BasicController {

    @ModelAttribute("locations")
    public Map<Integer, String> locations() {
        Map<Integer, String> locations = new LinkedHashMap<>();
        locations.put(1, "1 구역");
        locations.put(2, "2 구역");
        locations.put(3, "3 구역");
        return locations;
    }

    @GetMapping("/location")
    public String location(Model model) {
        model.addAttribute("rest", new Rest());
        return "main/location";
    }

    @PostMapping("/single")
    public String single(@ModelAttribute Rest rest) {
        log.info("rest.locations={}", rest.getLocations());
        return "main/single";
    }
}
