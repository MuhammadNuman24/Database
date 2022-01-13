package com.example.Database.Service;

import com.example.Database.Entities.Scheduling;

import java.util.List;

public interface SchedulingService {
    List<Scheduling> EventLIst();
    Scheduling getById(Long webId);
    Scheduling saveEvent(Scheduling scheduling);
    Scheduling updateEvent(Long webId, Scheduling scheduling);
    Boolean deleteEvent(Long webId);
}
