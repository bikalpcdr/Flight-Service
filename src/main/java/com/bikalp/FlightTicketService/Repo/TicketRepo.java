package com.bikalp.FlightTicketService.Repo;

import com.bikalp.FlightTicketService.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {
}
