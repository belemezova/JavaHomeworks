package bar_Info_Tables_Booking;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Dish {
    private String name;
    private String gramsOfDish;
    private BigDecimal price;
    private ProductType type;
    private LinkedHashMap<Product, Integer> recipe;

    public Dish(String name, String gramsOfDish, BigDecimal price, ProductType type) {

    }

    public LinkedHashMap<Product, Integer> getRecipe() {
        return recipe;
    }

    public void setRecipe(LinkedHashMap<Product, Integer> recipe) {
        this.recipe = recipe;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGramsOfDish() {
        return gramsOfDish;
    }

    public void setGramsOfDish(String gramsOfDish) {
        this.gramsOfDish = gramsOfDish;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
