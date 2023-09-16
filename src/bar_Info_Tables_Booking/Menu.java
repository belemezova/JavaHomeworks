package bar_Info_Tables_Booking;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();
    private List<Product> drinks = new ArrayList<Product>();
    private String name;
    private int id;

    public Menu() {

    }

    public Menu(List<Dish> dishes){

    }

    public List<Product> getDrinks() {
        return drinks;
    }

    public List<Dish> getDishes()
    {
        return dishes;
    }

    public void setDrinks(List<Product> drinks) {
        this.drinks = drinks;

    }


    public void setProducts(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
