package com.example.fpl.fantasy.teams.persistence.impl;


import com.example.fpl.fantasy.teams.Repository.TeamsRepository;
import com.example.fpl.fantasy.teams.model.Teams;
import com.example.fpl.fantasy.teams.persistence.ITeamsDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamsDAOImpl implements ITeamsDAO {

    private final TeamsRepository teamsRepository;

    public TeamsDAOImpl(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }


    @Override
    public List<Teams> readTeams() {
        return teamsRepository.findAll();
    }
}
