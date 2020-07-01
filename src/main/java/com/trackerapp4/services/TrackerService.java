package com.trackerapp4.services;

import com.trackerapp4.models.Tracker;
import com.trackerapp4.models.TrackerType;
import com.trackerapp4.models.User;
import com.trackerapp4.repositories.TrackerRepository;

import java.util.List;

public class TrackerService {
    private TrackerRepository trackerRepository;

    private List<Tracker> findAll() {
        return trackerRepository.findAll();
    }

    private Tracker save(Tracker newTracker) {
        return trackerRepository.save(newTracker);
    }

    private Tracker findTrackerById(int trackerId) {
        return trackerRepository.findById(trackerId);
    }

    private List<Tracker> findAllByUserId(int id){
        return trackerRepository.findAllByUserId(id);
    }
    private List<Tracker> findByType(TrackerType type){
        return trackerRepository.findByType(type);
    }
}
