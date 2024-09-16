package com.example.fpl.fantasy.controller;


import com.example.fpl.fantasy.controller.http.HttpRequestManager;
import com.example.fpl.fantasy.element_stats.service.IElementStatsService;
import com.example.fpl.fantasy.element_types.service.IElementTypesService;
import com.example.fpl.fantasy.elements.service.IElementsService;
import com.example.fpl.fantasy.events.service.IEventsService;
import com.example.fpl.fantasy.game_settings.service.IGameSettingsService;
import com.example.fpl.fantasy.phases.service.IPhasesService;
import com.example.fpl.fantasy.teams.service.ITeamsService;
import com.example.fpl.fantasy.total_players.service.ITotalPlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/fantasy/api")
public class FantasyController {

    private final IGameSettingsService iGameSettingsService;
    private final IPhasesService iPhasesService;
    private final ITeamsService iTeamsService;
    private final IElementsService iElementsService;
    private final IElementStatsService iElementStatsService;
    private final IElementTypesService iElementTypesService;
    private final ITotalPlayerService iTotalPlayerService;
    private final IEventsService iEventsService;

    HttpRequestManager httpRequestManager = new HttpRequestManager();


    public FantasyController(IGameSettingsService iGameSettingsService, IPhasesService iPhasesService, ITeamsService iTeamsService, IElementsService iElementsService, IElementStatsService iElementStatsService, IElementTypesService iElementTypesService, ITotalPlayerService iTotalPlayerService, IEventsService iEventsService) {
        this.iGameSettingsService = iGameSettingsService;
        this.iPhasesService = iPhasesService;
        this.iTeamsService = iTeamsService;
        this.iElementsService = iElementsService;
        this.iElementStatsService = iElementStatsService;
        this.iElementTypesService = iElementTypesService;
        this.iTotalPlayerService = iTotalPlayerService;
        this.iEventsService = iEventsService;
    }

    @GetMapping(value = "/get/settings")
    public ResponseEntity<?> getGameSettingsById() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iGameSettingsService.readGameSettings(0));
    }
    @GetMapping(value = "/get/phases")
    public ResponseEntity<?> getPhases() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iPhasesService.readPhases());
    }

    @GetMapping(value = "/get/teams")
    public ResponseEntity<?> getTeams() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iTeamsService.readTeams());
    }

    @GetMapping(value = "/get/elements")
    public ResponseEntity<?> getElements() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iElementsService.readElements());
    }
    @GetMapping(value = "/get/elementstats")
    public ResponseEntity<?> getElementStats() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iElementStatsService.readElementStats());
    }

    @GetMapping(value = "/get/elementypes")
    public ResponseEntity<?> getElementTypes() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iElementTypesService.readElementTypes());
    }

    @GetMapping(value = "/get/totalplayers")
    public ResponseEntity<?> getTotalPlayers() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iTotalPlayerService.readTotalPlayersById(1));
    }


    @GetMapping(value = "/get/events")
    public ResponseEntity<?> getEvents() throws IOException, InterruptedException {
        httpRequestManager.httpRequest();
        return ResponseEntity.ok(iEventsService.readEvents());
    }








}
