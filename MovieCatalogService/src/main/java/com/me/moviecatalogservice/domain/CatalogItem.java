package com.me.moviecatalogservice.domain;

import lombok.Data;

@Data
public class CatalogItem {
    private String name;
    private String desc;
    private Double rating;

    public CatalogItem(String name, String desc, Double rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}
