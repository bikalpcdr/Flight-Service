package com.bikalp.FlightTicketService.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "passanger_tb")
public class Passanger {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passanger_tb_seq_gen")
    @SequenceGenerator(name = "passanger_tb_seq_gen", sequenceName = "passanger_tb_seq", allocationSize = 1)
    private Long id;

    private String fristName;

    private String lastName;

    private String email;

    @OneToMany(mappedBy = "passanger")
    @JsonBackReference

    private List<Ticket> ticket;


}
