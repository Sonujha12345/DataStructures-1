package com.kodnest.TuneHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.TuneHub.entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, String> {

}
