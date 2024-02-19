// В контролері ProductController
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    // Код для відображення всіх товарів
    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "products";
    }

    // Код для відображення інформації про конкретний товар
    @GetMapping("/{id}")
    public String productInfo(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    // Код для відображення форми додавання товару
    @GetMapping("/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // Код для додавання нового товару
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/products/";
    }

    // Код для відображення форми зміни інформації про товар
    @GetMapping("/{id}/edit")
    public String showEditProductForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "edit-product";
    }

    // Код для оновлення інформації про товар
    @PostMapping("/{id}/edit")
    public String updateProduct(@PathVariable int id, @ModelAttribute Product updatedProduct) {
        productService.updateProduct(id, updatedProduct);
        return "redirect:/products/{id}";
    }

    // Код для видалення товару
    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/products/";
    }

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }
}

