package com.bookreview.booknook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Table(name= "review")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Review {
    @Id
    @Column(name="review_id", length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;

    @Column(name = "book_title", length = 200, nullable = false)
    private String bookTitle;

    @Column(name = "book_author", length = 200, nullable = false)
    private String bookAuthor;

    @Column(name = "rating", length = 10, nullable = false)
    private int rating;

    @Column(name = "review", length = 500, nullable = false)
    private String review;

    @Column(name = "date_added", length = 100, nullable = false)
    private String date;
}





