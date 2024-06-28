package com.ph.primeraweb.primera_wbe_springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_personas")
public class Persona {

    @Id
    private long id;
    private String nombre;
    private int edad;
}
