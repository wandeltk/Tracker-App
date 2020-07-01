package com.trackerapp4.services;

import com.trackerapp4.models.Record;
import com.trackerapp4.repositories.RecordRepository;

import java.util.List;

public class RecordService {

    private RecordRepository recordRepository;

    private Record findById(int id){
        return recordRepository.findById(id);
    }

    private Record save(Record newRecord){
        return recordRepository.save(newRecord);
    }

    private List<Record> findAll(){
        return recordRepository.findAll();
    }

    private List<Record> findAllByTrackerId(int id){
        return recordRepository.findAllByTrackerId(id);
    }
}
