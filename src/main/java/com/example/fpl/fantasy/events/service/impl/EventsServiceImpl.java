package com.example.fpl.fantasy.events.service.impl;

import com.example.fpl.fantasy.events.model.Events;
import com.example.fpl.fantasy.events.persistence.IEventsDAO;
import com.example.fpl.fantasy.events.service.IEventsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl implements IEventsService {

    private final IEventsDAO iEventsDAO;

    public EventsServiceImpl(IEventsDAO iEventsDAO) {
        this.iEventsDAO = iEventsDAO;
    }


    @Override
    public List<Events> readEvents() {
        return iEventsDAO.readEvents();
    }
}
