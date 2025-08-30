package com.lcwr.RatingService.services;

import com.lcwr.RatingService.model.Rating;
import com.lcwr.RatingService.repos.RatingRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImple implements RatingServices {
    @Autowired
    private RatingRepos ratingRepos;

    @Override
    public Rating createRating(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return ratingRepos.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepos.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepos.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepos.findByHotelId(hotelId);
    }

}
