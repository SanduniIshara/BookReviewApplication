package com.bookreview.booknook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReviewDTO {
    private String bookTitle;
    private String bookAuthor;
    private int rating;
    private String review;
    private String date;
}
