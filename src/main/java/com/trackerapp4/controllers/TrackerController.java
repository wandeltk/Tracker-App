package com.trackerapp4.controllers;

import com.trackerapp4.models.Tracker;
import com.trackerapp4.models.TrackerType;
import com.trackerapp4.services.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/trackers")
public class TrackerController {
    private TrackerService trackerService;

    @Autowired
    public TrackerController (TrackerService trackerService){
        this.trackerService = trackerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tracker> findAllTrackers() {return trackerService.findAll();}

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Tracker findTrackerById(@PathVariable int id) {
        return trackerService.findById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Tracker updateTracker(@RequestBody Tracker tracker){
        return trackerService.save(tracker);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Tracker newTracker(@RequestBody Tracker newTracker){
        return trackerService.save(newTracker);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tracker> findTrackerByUserId(@PathVariable int id){
        return trackerService.findAllByUserId(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tracker> findTrackerByType(@RequestParam(value = "type") TrackerType type){
        return trackerService.findByType(type);
    }
}
