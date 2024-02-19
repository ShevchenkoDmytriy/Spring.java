import com.example.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private int idCounter = 0;

    public ProductService() {
        products.add(new Product(++idCounter, "ASUS ROG STRIX f17", "Simple description", 120000, "Dnipro", "Alex"));
        products.add(new Product(++idCounter, "iPhone 15 PRO MAX", "Simple description", 86000, "Dnipro", "Tom"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        product.setId(++idCounter);
        products.add(product);
    }

    public void updateProduct(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                updatedProduct.setId(id);
                products.set(i, updatedProduct);
                return;
            }
        }
    }

    public void deleteProduct(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }
}

