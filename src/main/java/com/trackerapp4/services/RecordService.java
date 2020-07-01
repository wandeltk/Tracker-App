package com.trackerapp4.services;

import com.trackerapp4.models.Record;
import com.trackerapp4.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    private RecordRepository recordRepository;

    @Autowired
    public RecordService(RecordRepository repo){
        this.recordRepository = repo;
    }

    public Record findById(int id){
        return recordRepository.findById(id);
    }

    public Record save(Record newRecord){
        return recordRepository.save(newRecord);
    }

    public List<Record> findAll(){
        return recordRepository.findAll();
    }

    public List<Record> findAllByTrackerId(int id){
        return recordRepository.findAllByTrackerId(id);
    }
}
