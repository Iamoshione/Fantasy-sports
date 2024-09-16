package com.example.fpl.fantasy.game_settings.repository;

import com.example.fpl.fantasy.game_settings.model.GameSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameSettingsRepository extends JpaRepository<GameSettings,Integer> {
}
