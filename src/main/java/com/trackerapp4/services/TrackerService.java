package com.trackerapp4.services;

import com.trackerapp4.models.Tracker;
import com.trackerapp4.models.TrackerType;
import com.trackerapp4.repositories.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TrackerService {

    @Autowired
    private TrackerRepository trackerRepository;

    @Transactional
    public List<Tracker> findAll() {
        return trackerRepository.findAll();
    }

    @Transactional
    public Tracker findById(int id) {
        return trackerRepository.findById(id);
    }

    @Transactional
    public Tracker save(Tracker newTracker) {
        return trackerRepository.save(newTracker);
    }

    @Transactional
    public Tracker findTrackerById(int trackerId) {
        return trackerRepository.findById(trackerId);
    }

    @Transactional
    public List<Tracker> findAllByUserId(int id){
        return trackerRepository.findAllByUserId(id);
    }

    @Transactional
    public List<Tracker> findByType(TrackerType type){
        return trackerRepository.findByType(type);
    }
}
