package com.example.fpl.fantasy.phases.service.impl;

import com.example.fpl.fantasy.phases.model.Phases;
import com.example.fpl.fantasy.phases.persistence.IPhasesDAO;
import com.example.fpl.fantasy.phases.service.IPhasesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhasesServiceImpl implements IPhasesService {

    private final IPhasesDAO iPhasesDAO;

    public PhasesServiceImpl(IPhasesDAO iPhasesDAO) {
        this.iPhasesDAO = iPhasesDAO;
    }


    @Override
    public List<Phases> readPhases() {
        return iPhasesDAO.readPhases();
    }
}
