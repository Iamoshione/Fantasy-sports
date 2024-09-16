package com.example.fpl.fantasy.total_players.repository;

import com.example.fpl.fantasy.total_players.model.EventWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalPlayersRepository extends JpaRepository<EventWrapper,Integer> {
}
