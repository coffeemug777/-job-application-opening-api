package com.jobapplicationapp.openingapi.repository;

import com.jobapplicationapp.openingapi.model.Opening;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface OpeningRepository extends MongoRepository<Opening, BigInteger> {
}
