import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }
        return null;

    }

    public List<Product> getProductWithText(String Templates) {
        List<Product> prods = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().contains(Templates) || p.getType().contains(Templates) || p.getPlace().contains(Templates)) {
                prods.add(p);
            }
        }
        return prods;
    }
}