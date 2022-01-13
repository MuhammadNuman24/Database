package com.example.Database.Repository;

import com.example.Database.Entities.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingRepo extends JpaRepository<Scheduling, Long > {
}
