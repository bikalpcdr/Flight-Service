package com.bikalp.FlightTicketService.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "ticket_tb")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_tb_seq_gen")
    @SequenceGenerator(name = "ticket_tb_seq_gen", sequenceName = "ticket_tb_seq", allocationSize = 1)
    private Long id;

    private int ticketNumber;

    private String discription;

    private Date dateOfTravel;


    @ManyToOne
    @JoinColumn(name = "passanger_id", referencedColumnName = "id")
    private Passanger passanger;

}
