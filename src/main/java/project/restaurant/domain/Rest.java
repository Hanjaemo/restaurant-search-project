package project.restaurant.domain;

import lombok.Data;
import java.util.List;

@Data
public class Rest {

    private Long id;
    private String name;
    private List<Integer> locations;
    private Boolean single;
    private List<String> foodTypes;
    private List<String> category;
    private Integer maxPrice;
}
