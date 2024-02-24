package com.application.rest.SpringBootRest.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Getter @Setter @ToString
@Table(name = "client")
public class Client implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private int dni;


    public Client(String name, String lastname, int dni) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
    }

    public Client(){}


}
