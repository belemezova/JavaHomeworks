package bar_Info_Tables_Booking;

import java.util.LinkedHashMap;

public class Storage {
    private LinkedHashMap<String, Integer> storageProducts = new LinkedHashMap<>();

    public LinkedHashMap<String, Integer> getStorageProducts(LinkedHashMap<Product, Integer> storageProducts) {
        return this.storageProducts;
    }

    public void setStorageProducts(String name, int quantity) {
        this.storageProducts.put(name,quantity);
    }
}
