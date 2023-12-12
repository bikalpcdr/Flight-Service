package com.bikalp.FlightTicketService.Controller;

import com.bikalp.FlightTicketService.Entity.Ticket;
import com.bikalp.FlightTicketService.Service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/save")
    public ResponseEntity<Ticket> save(@RequestBody Ticket ticket){
        return ResponseEntity.ok().body(ticketService.save(ticket));
    }

    @PutMapping("/update")
    public ResponseEntity<Ticket> update(@RequestBody Ticket ticket){
        return ResponseEntity.ok().body(ticketService.update(ticket));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(ticketService.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Ticket>> getAll(){
        return ResponseEntity.ok().body(ticketService.getAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return ResponseEntity.ok().body(ticketService.deleteById(id));
    }
}
