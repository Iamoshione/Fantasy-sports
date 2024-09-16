package com.example.fpl.fantasy.phases.repository;

import com.example.fpl.fantasy.phases.model.Phases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhasesRepository extends JpaRepository<Phases,Integer> {
}
