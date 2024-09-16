package com.example.fpl.fantasy.element_stats.repository;

import com.example.fpl.fantasy.element_stats.model.ElementStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementsStatsRepository extends JpaRepository<ElementStats,String> {
}
