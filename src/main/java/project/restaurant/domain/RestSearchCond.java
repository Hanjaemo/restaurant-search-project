package project.restaurant.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class RestSearchCond {
    private Long id;
    private String name;
    private List<Integer> locations;
    private Boolean single;
    private List<String> foodTypes;
    private List<String> category;
    private Integer maxPrice;

    public RestSearchCond() {
    }

    public RestSearchCond(Long id, String name, List<Integer> locations, Boolean single, List<String> foodTypes, List<String> category, Integer maxPrice) {
        this.id = id;
        this.name = name;
        this.locations = locations;
        this.single = single;
        this.foodTypes = foodTypes;
        this.category = category;
        this.maxPrice = maxPrice;
    }
}
