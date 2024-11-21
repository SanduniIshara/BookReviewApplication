package com.bookreview.booknook.service;

import com.bookreview.booknook.dto.ReviewDTO;
import com.bookreview.booknook.dto.ReviewSearchDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    String saveReview(ReviewDTO reviewDTO);

    List<ReviewDTO> getAllReviews();

    String updateReview(ReviewSearchDTO reviewSearchDTO);

    String deleteReview(int reviewId);

    ReviewSearchDTO getReviewById(int reviewId);
}
