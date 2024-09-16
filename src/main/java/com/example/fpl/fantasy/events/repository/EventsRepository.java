package com.example.fpl.fantasy.events.repository;

import com.example.fpl.fantasy.events.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventsRepository extends JpaRepository<Events,Integer> {
}
