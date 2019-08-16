package com.cpbalance.cpbalancebackend.payment;

import com.cpbalance.cpbalancebackend.person.Person;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Payment {

    @Id @GeneratedValue
    private Long id;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;
    private Double value;
    private LocalDateTime datePaid;
    private LocalDateTime dateRegistered;
}
