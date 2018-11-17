package com.github.bryancheung.healthservice.controller;


import com.github.bryancheung.healthservice.entity.HealthContent;
import com.github.bryancheung.healthservice.service.HealthService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/health")
public class HealthServiceController {
    private static final Logger logger = LoggerFactory.getLogger(HealthServiceController.class);

    @Resource
    private HealthService healthService;

    @ApiOperation(value = "Health endpoint",
            notes = "health endpoint",
            response = HealthContent.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "success")})
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public HealthContent getHealth(HttpServletRequest request) {
        logger.info("get health content");
        return healthService.getHealth();
    }

}
