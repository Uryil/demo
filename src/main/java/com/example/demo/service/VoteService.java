package com.example.demo.service;

import com.example.demo.entity.Petition;
import com.example.demo.entity.User;
import com.example.demo.entity.Vote;
import com.example.demo.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public void castVote(User user, Petition petition) {
        Optional<Vote> existingVote = voteRepository.findByUserAndPetition(user, petition);
        if (existingVote.isPresent()) {
            throw new IllegalStateException("User has already voted for this petition.");
        }

        Vote vote = new Vote();
        vote.setUser(user);  // Метод setUser
        vote.setPetition(petition);  // Метод setPetition
        voteRepository.save(vote);

        petition.setVotesCount(petition.getVotesCount() + 1);  // Метод getVotesCount
    }
}
