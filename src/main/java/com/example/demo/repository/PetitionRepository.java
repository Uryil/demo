package com.example.demo.repository;


import com.example.demo.entity.Petition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetitionRepository extends JpaRepository<Petition, Long> {
}

