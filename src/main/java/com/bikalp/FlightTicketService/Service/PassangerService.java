package com.bikalp.FlightTicketService.Service;

import com.bikalp.FlightTicketService.Entity.Passanger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PassangerService {

    Passanger save(Passanger passanger);

    Passanger update(Passanger passanger);

    Passanger getById(Long id);

    boolean deleteById(Long id);

    List<Passanger> getAll();
}
