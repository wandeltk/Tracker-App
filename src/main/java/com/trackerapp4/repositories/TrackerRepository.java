package com.trackerapp4.repositories;

import com.trackerapp4.models.Tracker;
import org.springframework.data.repository.CrudRepository;

public interface TrackerRepository extends CrudRepository<Tracker, Integer> {
}
