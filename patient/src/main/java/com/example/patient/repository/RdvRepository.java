package com.example.patient.repository;

import com.example.patient.model.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvRepository extends JpaRepository<Rdv, Long> {
}
