package com.example.SpringbootBasics.Service;

import com.example.SpringbootBasics.Entity.Prompts;
import com.example.SpringbootBasics.Repository.PromptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptsService {
    @Autowired
public PromptsRepository promptsRepository;
 public List<Prompts> getAllPrompts(){
     return promptsRepository.findAll();
 }

    public List<Prompts> getPromtsWithStatusREL() {
     int limit = 1;
        return promptsRepository.findByStatus(limit);
    }


    public List<Prompts> getPromtsWithStatusCAR() {
        int limit = 1;
        return promptsRepository.findByCareer(limit);
    }

    public List<Prompts> getPromtsWithStatusHEAL() {
        int limit = 1;
        return promptsRepository.findByHeal(limit);
    }


 

 public Prompts Creatprompt(Prompts prompts){
     return promptsRepository.save(prompts);
 }


}
