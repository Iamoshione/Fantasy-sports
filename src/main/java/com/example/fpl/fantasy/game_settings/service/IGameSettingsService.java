package com.example.fpl.fantasy.game_settings.service;

import com.example.fpl.fantasy.game_settings.model.GameSettings;

import java.util.Optional;

public interface IGameSettingsService {
    Optional<GameSettings> readGameSettings(int id);
}
