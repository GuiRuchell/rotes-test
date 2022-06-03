package com.assembly.votation.crud.entity;

import org.hibernate.annotations.MetaValue;

import javax.persistence.*;

@Entity
@Table(name = "USER")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
}
