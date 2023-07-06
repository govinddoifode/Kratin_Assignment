package com.app.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.DietPlan;


@Repository
@Transactional
public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {

	 @Query("SELECT dp FROM DietPlan dp WHERE dp.patient.id = :patientId")
	    Optional<DietPlan> findById( long patientId);
}
