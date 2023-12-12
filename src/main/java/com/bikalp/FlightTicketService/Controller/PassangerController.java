package com.bikalp.FlightTicketService.Controller;

import com.bikalp.FlightTicketService.Entity.Passanger;
import com.bikalp.FlightTicketService.Service.PassangerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passanger")
public class PassangerController {

    private final PassangerService passangerService;

    public PassangerController(PassangerService passangerService) {
        this.passangerService = passangerService;
    }

    @PostMapping("/save")
    public ResponseEntity<Passanger> save(@RequestBody Passanger passanger){
        return ResponseEntity.ok().body(passangerService.save(passanger));
    }

    @PutMapping("/update")
    public ResponseEntity<Passanger> update(@RequestBody Passanger passanger){
        return ResponseEntity.ok().body(passangerService.save(passanger));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Passanger> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(passangerService.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Passanger>> getAll(){
        return ResponseEntity.ok().body(passangerService.getAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok().body(passangerService.deleteById(id));
    }
}
