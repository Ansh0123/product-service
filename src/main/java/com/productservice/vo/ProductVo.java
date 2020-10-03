package com.productservice.vo;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductVo {
    private String name;
    private Integer quantity;
    private List<Rating> ratings;

    public ProductVo() {
    }

    public ProductVo(String name, Integer quantity, List<Rating> ratings) {
        this.name = name;
        this.quantity = quantity;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
