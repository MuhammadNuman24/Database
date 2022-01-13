package com.example.Database.Service;

import com.example.Database.Entities.Scheduling;
import com.example.Database.Repository.SchedulingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private SchedulingRepo schedulingRepo;

    @Override
    public List<Scheduling> EventLIst() {
        return schedulingRepo.findAll();
    }

    @Override
    public Scheduling getById(Long webId) {
        return  schedulingRepo.getById(webId);
    }

    @Override
    public Scheduling saveEvent(Scheduling scheduling) {
        return schedulingRepo.saveAndFlush(scheduling);
    }

    @Override
    public Scheduling updateEvent(Long webId, Scheduling scheduling) {
      Scheduling model= schedulingRepo.getById(webId);
      model=schedulingRepo.save(scheduling);
      return  model;
    }

    @Override
    public Boolean deleteEvent(Long webId) {
      schedulingRepo.deleteById(webId);
      return  true;
    }
}
