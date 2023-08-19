package com.example.SpringbootBasics.Controller;

import com.example.SpringbootBasics.Entity.Prompts;
import com.example.SpringbootBasics.Repository.PromptsRepository;
import com.example.SpringbootBasics.Service.PromptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/prompts")
public class PromptsController {
    @Autowired
    public PromptsService promptsService;

    @GetMapping("/read")
    public List<Prompts> getAllPrompts(){
        return promptsService.getAllPrompts();
    }

    @GetMapping("/status/rel")
    public List<Prompts> getPromtsWithStatusREL() {
        return promptsService.getPromtsWithStatusREL();
    }

    @GetMapping("/status/car")
    public List<Prompts> getPromtsWithStatusCAR() {
        return promptsService.getPromtsWithStatusCAR();
    }

    @GetMapping("/status/heal")
    public List<Prompts> getPromtsWithStatusHEAL() {
        return promptsService.getPromtsWithStatusHEAL();
    }
    @PostMapping("/put")
    public  Prompts savePrompts( @RequestBody Prompts prompt){
        return promptsService.Creatprompt(prompt);
    }

}
