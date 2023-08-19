package com.example.SpringbootBasics.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prompts")
public class Prompts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String prompts;
    String status;





}
