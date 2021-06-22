package com.example.moviecatalogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){


        // get all frated movies ID
        /// for each movie ID call movie details
        //// put them all together

        List<Rating> ratings = Arrays.asList(
            new Rating("111", 10),
            new Rating("222", 9),
            new Rating("333", 2),
            new Rating("444", 6),
            new Rating("555", 8),
            new Rating("666", 1)
        );
        return ratings.stream().map( rating -> (new CatalogItem("Titanik", "test1",4)
        )).collect(Collectors.toList());
        
    }
}
