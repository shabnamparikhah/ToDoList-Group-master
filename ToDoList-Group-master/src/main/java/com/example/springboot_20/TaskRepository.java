package com.example.springboot_20;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TaskRepository extends CrudRepository<Task, Long>{

    ArrayList<Task> findByUsername(String username);

}
