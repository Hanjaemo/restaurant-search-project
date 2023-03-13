package project.restaurant.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Rest {

    private Long id;
    private String name;
    private Integer location;
    private Boolean single;
    private String foodType;
    private String category;
    private Integer price;

    private List<Integer> locations;

    public Rest() {
    }

    public Rest(Long id, String name, Integer location, Boolean single, String foodType, String category, Integer price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.single = single;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }
}
