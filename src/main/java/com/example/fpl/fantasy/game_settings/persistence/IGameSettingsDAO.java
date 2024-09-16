package com.example.fpl.fantasy.game_settings.persistence;

import com.example.fpl.fantasy.game_settings.model.GameSettings;

import java.util.Optional;

public interface IGameSettingsDAO {
    Optional<GameSettings> readGameSettings(int id);
}
