package com.example.fpl.fantasy.phases.persistence.impl;


import com.example.fpl.fantasy.phases.model.Phases;
import com.example.fpl.fantasy.phases.persistence.IPhasesDAO;
import com.example.fpl.fantasy.phases.repository.PhasesRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhasesDAOImpl implements IPhasesDAO {

    private final PhasesRepository phasesRepository;

    public PhasesDAOImpl(PhasesRepository phasesRepository) {
        this.phasesRepository = phasesRepository;
    }

    @Override
    public List<Phases> readPhases() {
        return phasesRepository.findAll();
    }
}
