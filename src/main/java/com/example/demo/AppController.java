package com.example.demo;

import com.azure.cosmos.models.PartitionKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AppController {

    private final AvailabilityCacheRepository availabilityCacheRepository;

    @Autowired
    public AppController(AvailabilityCacheRepository availabilityCacheRepository) {
        this.availabilityCacheRepository = availabilityCacheRepository;
    }

    @GetMapping(value = "/availabilityCacheItems/{id}")
    Mono<AvailabilityCacheItem> findAvailabilityCacheItem(@PathVariable(value = "id", required = true) String id) {
        return availabilityCacheRepository.findById(id, new PartitionKey(id));
    }

    @PostMapping(value = "/availabilityCacheItems")
    Mono<AvailabilityCacheItem> upsertAvailabilityCacheItem(@RequestBody AvailabilityCacheItem availabilityCacheItem) {
        return availabilityCacheRepository.save(availabilityCacheItem);
    }
}
