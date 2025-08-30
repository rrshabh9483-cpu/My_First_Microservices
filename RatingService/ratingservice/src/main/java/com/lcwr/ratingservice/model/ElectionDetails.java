package com.lcwr.RatingService.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"e_Id", "electionName"})
public class ElectionDetails {
    private int e_Id;
    private String electionName;
}
