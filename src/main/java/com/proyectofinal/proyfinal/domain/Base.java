package com.proyectofinal.proyfinal.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass

public class Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
