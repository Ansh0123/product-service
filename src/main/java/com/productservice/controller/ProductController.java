package com.productservice.controller;

import com.productservice.service.ProductService;
import com.productservice.vo.ProductVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    List<ProductVo> getAllProducts() {
        return productService.getAllProducts();
    }
}
