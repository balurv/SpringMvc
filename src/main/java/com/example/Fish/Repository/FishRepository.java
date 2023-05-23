package com.example.Fish.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Fish.Model.Fish;

@Repository
public interface FishRepository extends JpaRepository<Fish, Long> {

}
