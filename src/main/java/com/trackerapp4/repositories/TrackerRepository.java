package com.trackerapp4.repositories;

import com.trackerapp4.models.Tracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackerRepository extends CrudRepository<Tracker, Integer> {
    Tracker findById(int id);
    Tracker save(Tracker newTracker);
    List<Tracker> findAll();
}
