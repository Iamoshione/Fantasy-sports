package com.example.fpl.fantasy.element_stats.persistence.impl;


import com.example.fpl.fantasy.element_stats.model.ElementStats;
import com.example.fpl.fantasy.element_stats.persistence.IElementStatsDAO;
import com.example.fpl.fantasy.element_stats.repository.ElementsStatsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ElementStatsDAOImpl implements IElementStatsDAO {

    private final ElementsStatsRepository elementsStatsRepository;

    public ElementStatsDAOImpl(ElementsStatsRepository elementsStatsRepository) {
        this.elementsStatsRepository = elementsStatsRepository;
    }


    @Override
    public List<ElementStats> readElementStats() {
        return elementsStatsRepository.findAll();
    }
}
