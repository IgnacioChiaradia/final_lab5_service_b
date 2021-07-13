package com.example.final_lab5.controller;


import com.example.final_lab5.service.TicketService;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;


public class TicketControllerTest {

    TicketService ticketService;
    TicketController ticketController;

    @BeforeEach
    public void setUp() {
        ticketService = mock(TicketService.class);
        ticketController = new TicketController(ticketService);
    }

}