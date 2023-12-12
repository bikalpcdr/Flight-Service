package com.bikalp.FlightTicketService.Service.Implementation;

import com.bikalp.FlightTicketService.Entity.Passanger;
import com.bikalp.FlightTicketService.Repo.PassangerRepo;
import com.bikalp.FlightTicketService.Service.PassangerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassangerServiceImpl implements PassangerService {

    private final PassangerRepo passangerRepo;

    public PassangerServiceImpl(PassangerRepo passangerRepo) {
        this.passangerRepo = passangerRepo;
    }

    @Override
    public Passanger save(Passanger passanger) {
        return passangerRepo.save(passanger);
    }

    @Override
    public Passanger update(Passanger passanger) {
        return passangerRepo.save(passanger);
    }

    @Override
    public Passanger getById(Long id) {
        return passangerRepo.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) {
        passangerRepo.deleteById(id);
        return true;
    }

    @Override
    public List<Passanger> getAll() {
        return passangerRepo.findAll();
    }
}
