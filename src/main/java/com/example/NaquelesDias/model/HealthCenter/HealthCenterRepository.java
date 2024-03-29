package com.example.NaquelesDias.model.HealthCenter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthCenterRepository extends JpaRepository<HealthCenter, String> {


    boolean findById(int healthCenterId);
}