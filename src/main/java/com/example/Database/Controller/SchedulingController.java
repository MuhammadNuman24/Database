package com.example.Database.Controller;
import com.example.Database.Entities.Scheduling;
import com.example.Database.Exception.Exceptionhandling;
import com.example.Database.Service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController {
    @Autowired
    private SchedulingService schedulingService;
@GetMapping("/list")
public ResponseEntity<List<Scheduling>> getModel(){
     List<Scheduling> model =schedulingService.EventLIst();
     return  ResponseEntity.ok(model);
}
@GetMapping("/{webId}")
    public Scheduling getEvent(@PathVariable Long webId){
    try {
        return schedulingService.getById(webId);
    }catch (Exception ex){
        throw new Exceptionhandling("Can Not  Get Event", ex);
    }

}
@PostMapping("/")
    public  Scheduling SaveModel(@RequestBody Scheduling scheduling){
    try {
        return  schedulingService.saveEvent(scheduling);
    }catch (Exception ex){
        throw new Exceptionhandling("Can Not Save Event", ex);
    }
}
@PutMapping("/{webId}")
    public Scheduling UpdateModel(@PathVariable Long webId , @RequestBody Scheduling scheduling){
    try {
        return  schedulingService.updateEvent( webId , scheduling);
    }catch (Exception ex){
        throw new Exceptionhandling("Can Not Update Event", ex);
    }
}

    @DeleteMapping("/{webId}")
            public  Boolean deleteModel(@PathVariable Long webId){
        try {
            return schedulingService.deleteEvent(webId);
        }catch (Exception ex){
            throw new Exceptionhandling("Can Not Delete Event", ex);
        }
    }

}
