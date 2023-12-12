package com.bikalp.FlightTicketService.Service;

import com.bikalp.FlightTicketService.Entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    Ticket save(Ticket ticket);

    Ticket update(Ticket ticket);

    Ticket getById(Long id);

    boolean deleteById(Long id);

    List<Ticket> getAll();
}
