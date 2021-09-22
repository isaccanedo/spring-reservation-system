package com.isaccanedo.repos;

import com.isaccanedo.model.AmenityType;
import com.isaccanedo.model.Capacity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CapacityRepository extends JpaRepository<Capacity, Long> {

    Capacity findByAmenityType(AmenityType amenityType);
}
