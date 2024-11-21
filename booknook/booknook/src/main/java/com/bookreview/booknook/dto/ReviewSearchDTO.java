package com.bookreview.booknook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewSearchDTO {

    private int reviewId;
    private String bookTitle;
    private String bookAuthor;
    private int rating;
    private String review;
    private String date;
}



