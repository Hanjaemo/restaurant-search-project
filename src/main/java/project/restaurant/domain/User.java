package project.restaurant.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
public class User {

    private String name;
    private List<Integer> locationList;
    private Boolean single;
    private String foodType;
    private String category;
    private Integer price;

    public User() {
    }

    public User(String name, List<Integer> locationList, Boolean single, String foodType, String category, Integer price) {
        this.name = name;
        this.locationList = locationList;
        this.single = single;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }
}
