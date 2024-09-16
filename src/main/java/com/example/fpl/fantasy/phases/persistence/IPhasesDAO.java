package com.example.fpl.fantasy.phases.persistence;

import com.example.fpl.fantasy.phases.model.Phases;

import java.util.List;

public interface IPhasesDAO {
    List<Phases> readPhases();
}
