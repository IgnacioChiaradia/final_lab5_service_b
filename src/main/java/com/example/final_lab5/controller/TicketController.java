package com.example.final_lab5.controller;

import com.example.final_lab5.model.Ticket;
import com.example.final_lab5.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    @PostMapping
    public ResponseEntity addTicket(@RequestBody Ticket ticketAdd) {
        Ticket ticket = ticketService.add(ticketAdd);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/{controller}/{id}")
                .buildAndExpand(ticket, ticket.getUUID())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
