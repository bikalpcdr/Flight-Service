package com.bikalp.FlightTicketService.Service.Implementation;

import com.bikalp.FlightTicketService.Entity.Ticket;
import com.bikalp.FlightTicketService.Repo.TicketRepo;
import com.bikalp.FlightTicketService.Service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;

    public TicketServiceImpl(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket getById(Long id) {
        return ticketRepo.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) {
        ticketRepo.deleteById(id);
        return true;
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepo.findAll();
    }
}
