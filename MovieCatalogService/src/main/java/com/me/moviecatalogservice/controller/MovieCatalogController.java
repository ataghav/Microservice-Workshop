package com.me.moviecatalogservice.controller;

import com.me.moviecatalogservice.domain.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){
        return Collections.singletonList(
                new CatalogItem("Seven","good movie",7.5)
        );
    }
}
