package com.example.SpringbootBasics.Repository;

import com.example.SpringbootBasics.Entity.Prompts;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromptsRepository extends JpaRepository<Prompts ,Long> {
    @Query(value = "SELECT * FROM prompts WHERE status = 'REL' ORDER BY RAND() LIMIT ?1", nativeQuery = true)
    List<Prompts> findByStatus(int limit);

    @Query(value = "SELECT * FROM prompts WHERE status = 'CAR' ORDER BY RAND() LIMIT ?1", nativeQuery = true)
    List<Prompts> findByCareer(int limit);

    @Query(value = "SELECT * FROM prompts WHERE status = 'HEAL' ORDER BY RAND() LIMIT ?1", nativeQuery = true)
    List<Prompts> findByHeal(int limit);


}
