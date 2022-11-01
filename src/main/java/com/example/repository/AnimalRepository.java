package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Animal;

import java.util.List;
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
