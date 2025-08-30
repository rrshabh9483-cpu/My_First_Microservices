package com.lcwr.RatingService.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_ratings")
@JsonPropertyOrder({"ratingId", "userId", "hotelId", "rating", "feedback", "ratingProveiderDetails" })
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

    //it will not create the array it will just show as nested property
//    @Transient
//    private RatingProvider ratingProviderDetails = new RatingProvider();

    //for RatingProvider array
    //for ratingProviderDetailsArray
    @Transient
    private List<RatingProvider> ratingProviderDetails = new ArrayList<>();
}
