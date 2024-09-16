package com.example.fpl.fantasy.element_stats.persistence;

import com.example.fpl.fantasy.element_stats.model.ElementStats;

import java.util.List;

public interface IElementStatsDAO {
    List<ElementStats> readElementStats();
}
