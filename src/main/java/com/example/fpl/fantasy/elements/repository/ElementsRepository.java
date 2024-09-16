package com.example.fpl.fantasy.elements.repository;

import com.example.fpl.fantasy.elements.model.Elements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsRepository extends JpaRepository<Elements,Integer> {
}
