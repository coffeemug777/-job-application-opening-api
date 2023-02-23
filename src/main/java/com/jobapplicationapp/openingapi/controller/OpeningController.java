package com.jobapplicationapp.openingapi.controller;

import com.jobapplicationapp.openingapi.dto.OpeningRequest;
import com.jobapplicationapp.openingapi.model.Opening;
import com.jobapplicationapp.openingapi.service.OpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class OpeningController {

    @Autowired
    private OpeningService openingService;

    @PostMapping("opening")
    public Opening addOpening(@RequestBody OpeningRequest openingRequest) {
        return this.openingService.addOpening(openingRequest);
    }

    @GetMapping("opening/all")
    public List<Opening> getAll() {
        return this.openingService.getAll();
    }

}
