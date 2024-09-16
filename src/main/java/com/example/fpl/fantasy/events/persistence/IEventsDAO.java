package com.example.fpl.fantasy.events.persistence;

import com.example.fpl.fantasy.events.model.Events;

import java.util.List;

public interface IEventsDAO {
    List<Events> readEvents();
}
