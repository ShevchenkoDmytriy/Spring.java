package com.example.demo.controllers;

import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //может не тот импорт
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable int id, Model model)
    {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

}
