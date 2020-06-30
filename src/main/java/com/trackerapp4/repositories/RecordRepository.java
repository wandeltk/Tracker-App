package com.trackerapp4.repositories;

import com.trackerapp4.models.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Integer> {
}
