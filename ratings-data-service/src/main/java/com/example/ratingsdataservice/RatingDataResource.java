package com.example.ratingsdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
    
    @RequestMapping("/{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId") String movieId) {

        return new Rating(movieId, 10);

    }
}