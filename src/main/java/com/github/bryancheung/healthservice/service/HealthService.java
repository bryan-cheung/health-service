package com.github.bryancheung.healthservice.service;

import com.github.bryancheung.healthservice.entity.HealthContent;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthContent getHealth() {
        return new HealthContent("HealthService", "0.0.1", true);
    }
}
