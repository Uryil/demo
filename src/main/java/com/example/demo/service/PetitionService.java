package com.example.demo.service;



import com.example.demo.entity.Petition;
import com.example.demo.repository.PetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetitionService {
    @Autowired
    private PetitionRepository petitionRepository;

    // Получить все петиции
    public List<Petition> getAllPetitions() {
        return petitionRepository.findAll();
    }

    // Создать новую петицию
    public Petition createPetition(Petition petition) {
        return petitionRepository.save(petition);
    }

    // Найти петицию по ID
    public Optional<Petition> getPetitionById(Long id) {
        return petitionRepository.findById(id);
    }

    // Удалить петицию
    public void deletePetition(Long id) {
        petitionRepository.deleteById(id);
    }
}

