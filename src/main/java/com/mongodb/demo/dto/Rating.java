package com.mongodb.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


public class Rating {

    private int rating;
    @Field(name = "noOfReviews")
    private int no_of_reviews;
    public int getNo_of_reviews() {
        return no_of_reviews;
    }

    public void setNo_of_reviews(int no_of_reviews) {
        this.no_of_reviews = no_of_reviews;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating=" + rating +
                ", no_of_reviews=" + no_of_reviews +
                '}';
    }
}
