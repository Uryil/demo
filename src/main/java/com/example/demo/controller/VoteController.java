package com.example.demo.controller;


import com.example.demo.entity.Petition;
import com.example.demo.entity.User;
import com.example.demo.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping("/{petitionId}/vote")
    public String castVote(@PathVariable Long petitionId, @RequestBody User user) {
        Petition petition = new Petition(); // Замените на поиск петиции через сервис
        voteService.castVote(user, petition);
        return "Vote cast successfully!";
    }
}

