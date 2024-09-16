package com.example.fpl.fantasy.total_players.service.impl;


import com.example.fpl.fantasy.total_players.model.EventWrapper;
import com.example.fpl.fantasy.total_players.persistence.ITotalPlayersDAO;
import com.example.fpl.fantasy.total_players.service.ITotalPlayerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TotalPlayersServiceImpl implements ITotalPlayerService {

    private final ITotalPlayersDAO iTotalPlayersDAO;

    public TotalPlayersServiceImpl(ITotalPlayersDAO iTotalPlayersDAO) {
        this.iTotalPlayersDAO = iTotalPlayersDAO;
    }


    @Override
    public Optional<EventWrapper> readTotalPlayersById(int id) {
        return iTotalPlayersDAO.readTotalPlayersById(id);
    }
}
