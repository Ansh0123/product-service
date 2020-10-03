package com.productservice.service;

import com.productservice.dao.ProductRepositoryDao;
import com.productservice.model.Product;
import com.productservice.vo.ProductVo;
import com.productservice.vo.Rating;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryDao productRepositoryDao;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ProductVo> getAllProducts() {
        Iterable<Product> products = productRepositoryDao.findAll();
        List<ProductVo> productVos = new ArrayList<>();

        products.forEach(product -> {
            ProductVo productVo = new ProductVo();
            Integer ratingId = product.getRating_id();
            // Call Rating service to get rating details
            Rating rating = restTemplate.getForObject("http://rating-service/rating/{id}", Rating.class, ratingId);
            productVo.setName(product.getName());
            productVo.setQuantity(product.getQuantity());
            productVo.setRatings(Collections.singletonList(rating));
            productVos.add(productVo);
        });
        return productVos;
    }
}
