package com.example.final_lab5.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Ticket {

    @Id
    private Integer UUID;
    private Integer discount;

}
