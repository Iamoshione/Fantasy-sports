package com.example.fpl.fantasy.teams.persistence;

import com.example.fpl.fantasy.teams.model.Teams;

import java.util.List;

public interface ITeamsDAO {
    List<Teams> readTeams();
}
