package com.example.fpl.fantasy.total_players.persistence.impl;


import com.example.fpl.fantasy.total_players.model.EventWrapper;
import com.example.fpl.fantasy.total_players.persistence.ITotalPlayersDAO;
import com.example.fpl.fantasy.total_players.repository.TotalPlayersRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TotalPlayersDAOImpl implements ITotalPlayersDAO {

    private final TotalPlayersRepository totalPlayersRepository;

    public TotalPlayersDAOImpl(TotalPlayersRepository totalPlayersRepository) {
        this.totalPlayersRepository = totalPlayersRepository;
    }


    @Override
    public Optional<EventWrapper> readTotalPlayersById(int id) {
        return totalPlayersRepository.findById(id);
    }
}
