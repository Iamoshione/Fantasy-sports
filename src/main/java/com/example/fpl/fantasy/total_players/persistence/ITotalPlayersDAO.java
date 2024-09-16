package com.example.fpl.fantasy.total_players.persistence;

import com.example.fpl.fantasy.total_players.model.EventWrapper;

import java.util.Optional;

public interface ITotalPlayersDAO {
    Optional<EventWrapper> readTotalPlayersById(int id);
}
