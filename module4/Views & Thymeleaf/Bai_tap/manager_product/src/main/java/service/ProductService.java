package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 5", 300, "Iphone"));
        products.put(2, new Product(2, "Iphone 6", 400, "Iphone"));
        products.put(3, new Product(3, "Iphone 7", 500, "Iphone"));
        products.put(4, new Product(4, "Iphone 8", 600, "Iphone"));
        products.put(5, new Product(5, "Iphone X", 700, "Iphone"));
    }
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
    public void delete(int id) {
        products.remove(id);
    }
    public void create( Product product) {
        products.put(product.getId(), product);
    }
    public void update(int id, Product product) {
        products.put(id, product);
    }
    public Product findById(int id) {
        return products.get(id);
    }
}
