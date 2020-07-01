package com.trackerapp4.services;

import com.trackerapp4.models.Tracker;
import com.trackerapp4.models.TrackerType;
import com.trackerapp4.repositories.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackerService {

    private TrackerRepository trackerRepository;

    @Autowired
    public TrackerService(TrackerRepository repo){
        this.trackerRepository = repo;
    }

    public List<Tracker> findAll() {
        return trackerRepository.findAll();
    }

    public Tracker findById(int id) {
        return trackerRepository.findById(id);
    }

    public Tracker save(Tracker newTracker) {
        return trackerRepository.save(newTracker);
    }

    public Tracker findTrackerById(int trackerId) {
        return trackerRepository.findById(trackerId);
    }

    public List<Tracker> findAllByUserId(int id){
        return trackerRepository.findAllByUserId(id);
    }
    public List<Tracker> findByType(TrackerType type){
        return trackerRepository.findByType(type);
    }
}
