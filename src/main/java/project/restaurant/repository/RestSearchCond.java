package project.restaurant.repository;

public class RestSearchCond {

    private String name;
    private Integer location;
    private Boolean single;
    private String foodType;
    private String category;
    private Integer price;

    public RestSearchCond() {
    }

    public RestSearchCond(String name, Integer location, Boolean single, String foodType, String category, Integer price) {
        this.name = name;
        this.location = location;
        this.single = single;
        this.foodType = foodType;
        this.category = category;
        this.price = price;
    }
}
