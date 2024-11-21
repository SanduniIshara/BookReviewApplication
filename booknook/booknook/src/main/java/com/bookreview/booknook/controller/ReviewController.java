package com.bookreview.booknook.controller;

import com.bookreview.booknook.dto.ReviewDTO;
import com.bookreview.booknook.dto.ReviewSearchDTO;
import com.bookreview.booknook.repo.ReviewRepo;
import com.bookreview.booknook.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private ReviewRepo reviewRepo;


    @PostMapping({"/save"})
    public String saveReview(@RequestBody ReviewDTO reviewDTO) {
        String message = reviewService.saveReview(reviewDTO);
        return "saved Successfully";
    }

    @GetMapping(
            path = "/get-all-reviews"
    )
    public List<ReviewDTO> getAllReviews(){
        List<ReviewDTO> allReviews= reviewService.getAllReviews();
        return  allReviews;
    }

    @PutMapping(path = "/update")
    public String updateReview(@RequestBody ReviewSearchDTO reviewSearchDTO) {
        String message = reviewService.updateReview(reviewSearchDTO);
        return message;

    }

    @DeleteMapping(
            path="/delete-review/{id}"
    )
    public String deleteReview(@PathVariable(value = "id")int reviewId){
        String deleted = reviewService.deleteReview(reviewId);
        return deleted;
    }

    @GetMapping(
            path="/get-by-id",
            params = "id"
    )
    public ReviewSearchDTO getReviewById(@RequestParam(value = "id") int reviewId){
        ReviewSearchDTO reviewSearchDTO = reviewService.getReviewById(reviewId);
        return reviewSearchDTO;

    }

}





