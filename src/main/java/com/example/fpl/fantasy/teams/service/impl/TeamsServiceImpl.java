package com.example.fpl.fantasy.teams.service.impl;

import com.example.fpl.fantasy.teams.model.Teams;
import com.example.fpl.fantasy.teams.persistence.ITeamsDAO;
import com.example.fpl.fantasy.teams.service.ITeamsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsServiceImpl implements ITeamsService {

    private final ITeamsDAO iTeamsDAO;

    public TeamsServiceImpl(ITeamsDAO iTeamsDAO) {
        this.iTeamsDAO = iTeamsDAO;
    }


    @Override
    public List<Teams> readTeams() {
        return iTeamsDAO.readTeams();
    }
}
