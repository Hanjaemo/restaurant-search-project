package project.restaurant.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    private String name;
    private Integer location;
    private Boolean single;
    private String foodType;
    private String category;
    private Integer price;

    public User() {
    }

    public User(String name, Integer location, Boolean single, String foodType, String category, Integer price) {
        this.name = name;
        this.location = location;
        this.single = single;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }
}
