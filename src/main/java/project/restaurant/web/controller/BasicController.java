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
import project.restaurant.service.RestService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BasicController {

    private final RestService restService;

    @ModelAttribute("locations")
    public Map<Integer, String> locations() {
        Map<Integer, String> locations = new LinkedHashMap<>();
        locations.put(1, "1 구역");
        locations.put(2, "2 구역");
        locations.put(3, "3 구역");
        return locations;
    }

    @ModelAttribute("foodTypes")
    public Map<String, String> foodTypes() {
        Map<String, String> foodTypes = new LinkedHashMap<>();
        foodTypes.put("RICE", "밥");
        foodTypes.put("NOODLE", "면");
        foodTypes.put("FASTFOOD", "패스트푸드");
        return foodTypes;
    }

    @ModelAttribute("category")
    public Map<String, String> category() {
        Map<String, String> category = new LinkedHashMap<>();
        category.put("kor", "한식");
        category.put("chn", "중식");
        category.put("jpn", "일식");
        category.put("west", "양식");
        category.put("snack", "분식");
        category.put("pork", "돈가스");
        category.put("meat", "고기");
        return category;
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

    @PostMapping("/food-type")
    public String foodType(@ModelAttribute Rest rest) {
        log.info("rest.single={}", rest.getSingle());
        return "main/food-type";
    }

    @PostMapping("/category")
    public String category(@ModelAttribute Rest rest) {
        log.info("rest.foodTypes={}", rest.getFoodTypes());
        return "main/category";
    }

    @PostMapping("/price")
    public String price(@ModelAttribute Rest rest) {
        log.info("rest.category={}", rest.getCategory());
        return "main/price";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute Rest rest, Model model) {
        log.info("rest.maxPrice={}", rest.getMaxPrice());
        List<Rest> restaurants = restService.findAll(rest);
        model.addAttribute("restaurants", restaurants);
        return "main/result";
    }
}
