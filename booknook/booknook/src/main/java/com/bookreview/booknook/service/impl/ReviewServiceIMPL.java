package com.bookreview.booknook.service.impl;

import com.bookreview.booknook.dto.ReviewDTO;
import com.bookreview.booknook.dto.ReviewSearchDTO;
import com.bookreview.booknook.entity.Review;
import com.bookreview.booknook.repo.ReviewRepo;
import com.bookreview.booknook.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReviewServiceIMPL implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveReview(ReviewDTO reviewDTO) {
        Review review = modelMapper.map(reviewDTO, Review.class);
        reviewRepo.save(review);
        return "Saved Successfully";

    }

    @Override
    public List<ReviewDTO> getAllReviews() {
        List<Review> getAllReviews = reviewRepo.findAll();
        List<ReviewDTO> reviewDTOList = getAllReviews.stream()
                .map(review -> modelMapper.map(review, ReviewDTO.class))
                .collect(Collectors.toList());

        return reviewDTOList;
    }

    @Override
    public String updateReview(ReviewSearchDTO reviewSearchDTO) {
        if(reviewRepo.existsById(reviewSearchDTO.getReviewId())){
            Review review = reviewRepo.getReferenceById(reviewSearchDTO.getReviewId());
            modelMapper.map(reviewSearchDTO, review);
            reviewRepo.save(review);
            return " Update Success";

        }else{
            throw new RuntimeException("No data found");
        }
    }

    @Override
    public String deleteReview(int reviewId) {
        if(reviewRepo.existsById(reviewId)){
            reviewRepo.deleteById(reviewId);
            return "Deleted success "+reviewId;
        }else{
            throw new RuntimeException("No customer found in that id");
        }
    }

    @Override
    public ReviewSearchDTO getReviewById(int reviewId) {
        if(reviewRepo.existsById(reviewId)){
            Review review = reviewRepo.getReferenceById(reviewId);
            ReviewSearchDTO reviewSearchDTO = new ReviewSearchDTO(
                    review.getReviewId(),
                    review.getBookTitle(),
                    review.getBookAuthor(),
                    review.getRating(),
                    review.getReview(),
                    review.getDate()

            );
            return reviewSearchDTO;
        }else{
            throw new RuntimeException("No Review");
        }

    }


}
