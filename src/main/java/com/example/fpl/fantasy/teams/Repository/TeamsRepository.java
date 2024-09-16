package com.example.fpl.fantasy.teams.Repository;

import com.example.fpl.fantasy.teams.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRepository extends JpaRepository<Teams,Integer> {
}
