package com.example.fpl.fantasy.events.persistence.impl;


import com.example.fpl.fantasy.events.model.Events;
import com.example.fpl.fantasy.events.persistence.IEventsDAO;
import com.example.fpl.fantasy.events.repository.EventsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventsDAOImpl implements IEventsDAO {


    private final EventsRepository eventsRepository;

    public EventsDAOImpl(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<Events> readEvents() {
        return eventsRepository.findAll();
    }
}
