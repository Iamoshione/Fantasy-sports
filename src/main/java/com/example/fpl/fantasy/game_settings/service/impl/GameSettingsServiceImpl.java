package com.example.fpl.fantasy.game_settings.service.impl;

import com.example.fpl.fantasy.game_settings.model.GameSettings;
import com.example.fpl.fantasy.game_settings.persistence.IGameSettingsDAO;
import com.example.fpl.fantasy.game_settings.service.IGameSettingsService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GameSettingsServiceImpl implements IGameSettingsService {

    private final IGameSettingsDAO iGameSettingsDAO;

    public GameSettingsServiceImpl(IGameSettingsDAO iGameSettingsDAO) {
        this.iGameSettingsDAO = iGameSettingsDAO;
    }


    @Override
    public Optional<GameSettings> readGameSettings(int id) {
        return iGameSettingsDAO.readGameSettings(id);
    }
}
