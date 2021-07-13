package com.example.final_lab5.service;

import com.example.final_lab5.model.Ticket;
import com.example.final_lab5.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket add(Ticket ticket){
        return ticketRepository.save(ticket);
    }
}
