package com.trackerapp4.services;

import com.trackerapp4.models.Record;
import com.trackerapp4.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Transactional
    public Record findById(int id){
        return recordRepository.findById(id);
    }

    @Transactional
    public Record save(Record newRecord){
        return recordRepository.save(newRecord);
    }

    @Transactional
    public List<Record> findAll(){
        return recordRepository.findAll();
    }

    @Transactional
    public List<Record> findAllByTrackerId(int id){
        return recordRepository.findAllByTrackerId(id);
    }
}
