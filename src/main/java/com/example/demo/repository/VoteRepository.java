package com.example.demo.repository;


import com.example.demo.entity.Vote;
import com.example.demo.entity.User;
import com.example.demo.entity.Petition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findByUserAndPetition(User user, Petition petition);
}

