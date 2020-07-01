package com.trackerapp4.repositories;

import com.trackerapp4.models.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends CrudRepository<Record, Integer> {
    Record findById(int id);
    Record save(Record newRecord);
    List<Record> findAll();
    List<Record> findAllByTrackerId(int id);
}
