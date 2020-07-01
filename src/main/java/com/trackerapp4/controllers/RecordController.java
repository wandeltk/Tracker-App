package com.trackerapp4.controllers;

import com.trackerapp4.models.Record;
import com.trackerapp4.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

    private RecordService recordService;

    @Autowired
    public RecordController (RecordService recordService){
        this.recordService = recordService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Record> findAllRecords() {return recordService.findAll();}

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Record findRecordById(@PathVariable int id) {
        return recordService.findById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Record updateRecord(@RequestBody Record record){
        return recordService.save(record);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Record newRecord(@RequestBody Record newRecord){
        return recordService.save(newRecord);
    }

    @GetMapping(value = "/tracker/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Record> findRecordByTrackerId(@PathVariable int id){
        return recordService.findAllByTrackerId(id);
    }
}
