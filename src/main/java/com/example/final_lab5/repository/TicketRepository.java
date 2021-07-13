package com.example.final_lab5.repository;

import com.example.final_lab5.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository extends JpaRepository<Ticket, String> {


}
