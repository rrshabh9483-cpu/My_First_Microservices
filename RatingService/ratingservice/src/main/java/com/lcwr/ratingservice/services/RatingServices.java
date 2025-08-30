package com.lcwr.RatingService.services;

import com.lcwr.RatingService.model.Rating;

import java.util.List;

public interface RatingServices {

    //create rating
    Rating createRating(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotelId
    List<Rating> getRatingByHotelId(String HotelId);
}
