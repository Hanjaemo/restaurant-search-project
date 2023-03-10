package project.restaurant.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private Integer location;
    private Boolean single;
    private String foodType;
    private String category;
    private Integer price;

    public User() {
    }

    public User(Integer location, Boolean single, String foodType, String category, Integer price) {
        this.location = location;
        this.single = single;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }
}
