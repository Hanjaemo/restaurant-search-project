package project.restaurant.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Rest {

    private Long id;
    private String name;
    private List<Integer> locations;
    private Boolean single;
    private List<String> foodTypes;
    private List<String> category;
    private Integer maxPrice;
}
