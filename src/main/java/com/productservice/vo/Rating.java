package com.productservice.vo;

import org.springframework.stereotype.Component;

@Component
public class Rating {
    private Integer id;
    private String userName;
    private Integer rating;
    private Integer product_id;

    public Rating() {
    }

    public Rating(Integer id, String userName, Integer rating, Integer product_id) {
        this.id = id;
        this.userName = userName;
        this.rating = rating;
        this.product_id = product_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}
