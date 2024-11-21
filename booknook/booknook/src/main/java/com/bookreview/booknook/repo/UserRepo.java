package com.bookreview.booknook.repo;

import com.bookreview.booknook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
