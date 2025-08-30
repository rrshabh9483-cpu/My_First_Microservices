package com.lcwr.RatingService.controllers;

import com.lcwr.RatingService.model.Rating;
import com.lcwr.RatingService.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Rating")
public class RatingController {

    @Autowired
    private RatingServices ratingServices;

    //create rating

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating ratingCreated = ratingServices.createRating(rating);
        return new ResponseEntity<>(ratingCreated, HttpStatus.CREATED);

    }

    //get all ratings
    @GetMapping("/allRating")
    public ResponseEntity<List<Rating>> allRatings() {
        List<Rating> allRatings = ratingServices.getAllRatings();
        return new ResponseEntity<>(allRatings,HttpStatus.OK);
    }

    //get rating by user
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUser(@PathVariable  String userId) {
        List<Rating> allRatings = ratingServices.getRatingByUserId(userId);
        return new ResponseEntity<>(allRatings, HttpStatus.OK);
    }

    //get rating by hotel
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotel(@PathVariable  String hotelId) {
        List<Rating> allRatings = ratingServices.getRatingByHotelId(hotelId);
        return new ResponseEntity<>(allRatings,HttpStatus.OK);
    }
}
