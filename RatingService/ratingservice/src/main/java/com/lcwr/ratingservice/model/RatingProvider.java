package com.lcwr.RatingService.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@JsonPropertyOrder({"RPName", "identity", "election"})
public class RatingProvider {
    private String RPName;
    private String identity;
    @Transient
    private ElectionDetails election = new ElectionDetails();
}
