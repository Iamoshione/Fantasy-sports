package com.example.fpl.fantasy.total_players.service;

import com.example.fpl.fantasy.total_players.model.EventWrapper;

import java.util.Optional;

public interface ITotalPlayerService {
    Optional<EventWrapper> readTotalPlayersById(int id);
}
