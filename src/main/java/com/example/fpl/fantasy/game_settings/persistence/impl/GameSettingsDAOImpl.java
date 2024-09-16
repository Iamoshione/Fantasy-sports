package com.example.fpl.fantasy.game_settings.persistence.impl;

import com.example.fpl.fantasy.game_settings.model.GameSettings;
import com.example.fpl.fantasy.game_settings.persistence.IGameSettingsDAO;
import com.example.fpl.fantasy.game_settings.repository.GameSettingsRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GameSettingsDAOImpl implements IGameSettingsDAO {

    private final GameSettingsRepository gameSettingsRepository;

    public GameSettingsDAOImpl(GameSettingsRepository gameSettingsRepository) {
        this.gameSettingsRepository = gameSettingsRepository;
    }

    @Override
    public Optional<GameSettings> readGameSettings(int id) {
       return gameSettingsRepository.findById(id);
    }



}
