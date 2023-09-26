package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RegisterTaskList;

public interface AdditionRpository extends JpaRepository<RegisterTaskList, Integer> {

}
