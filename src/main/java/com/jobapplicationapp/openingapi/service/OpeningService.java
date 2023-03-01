package com.jobapplicationapp.openingapi.service;

import com.jobapplicationapp.openingapi.dto.OpeningRequest;
import com.jobapplicationapp.openingapi.model.ApplicationConnector;
import com.jobapplicationapp.openingapi.model.Opening;
import com.jobapplicationapp.openingapi.repository.OpeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OpeningService {

    @Autowired
    private OpeningRepository openingRepository;

    public Opening addOpening(OpeningRequest openingRequest) {
        return this.openingRepository.save(Opening.builder()
                        .title(openingRequest.getTitle())
                        .description(openingRequest.getDescription())
                        .completedApplications(Collections.<ApplicationConnector>emptyList())
                        .incompleteApplications(Collections.<ApplicationConnector>emptyList())
                .build());
    }

    public List<Opening> getAll() {
        return this.openingRepository.findAll();
    }

    public Optional<Opening> get(String id) {
        return this.openingRepository.findById(id);
    }
}
