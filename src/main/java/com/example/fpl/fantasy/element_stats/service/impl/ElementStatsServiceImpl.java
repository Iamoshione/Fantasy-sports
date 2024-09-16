package com.example.fpl.fantasy.element_stats.service.impl;

import com.example.fpl.fantasy.element_stats.model.ElementStats;
import com.example.fpl.fantasy.element_stats.persistence.IElementStatsDAO;
import com.example.fpl.fantasy.element_stats.service.IElementStatsService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ElementStatsServiceImpl implements IElementStatsService {

    private final IElementStatsDAO iElementStatsDAO;

    public ElementStatsServiceImpl(IElementStatsDAO iElementStatsDAO) {
        this.iElementStatsDAO = iElementStatsDAO;
    }

    @Override
    public List<ElementStats> readElementStats() {
        return iElementStatsDAO.readElementStats();
    }
}
