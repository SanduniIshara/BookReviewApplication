package com.bookreview.booknook.repo;

import com.bookreview.booknook.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface ReviewRepo extends JpaRepository<Review,Integer> {

}
