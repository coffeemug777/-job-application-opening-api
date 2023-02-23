package com.jobapplicationapp.openingapi.model;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@Document
public class Opening {

    @Id
    @Generated
    private BigInteger id;
    private String title;
    private String description;
    private List<ApplicationConnector> completedApplications;
    private List<ApplicationConnector> incompleteApplications;
}
