package com.cg.bootcamp.healthcare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bootcamp.healthcare.Entities.Diagnostic_Center;

@Repository
public interface Diagnostic_Center_Dao extends JpaRepository<Diagnostic_Center, String> {

}
