package com.rihab.interventions.entities;

import lombok.Data;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data

@Entity
@Table(name = "client")
public class Client {
	
   @Id
   private String codeClient;

private String nom;
private String prenom;
private String tel;
    private String nomSociete;
    private String poste;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
@JsonIgnore
@OneToMany(mappedBy = "client")
private List<Ticket> Tickets;


    
}