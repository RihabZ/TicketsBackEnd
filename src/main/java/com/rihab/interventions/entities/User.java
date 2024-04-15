package com.rihab.interventions.entities;

import java.util.List;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;
import java.util.List;


@Data 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
public class User  implements UserDetails { 
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
@Column(name = "user_id") // Spécifie le nom de la colonne d'identifiant
private Long id;

private String nom;
private String prenom;
@Column(unique=true)
private String username;
private String password;
private String email;
private Boolean enabled;
@Enumerated(value = EnumType.STRING)
private Role role;

private String tel;
private String age;

@JsonIgnore
@OneToMany(mappedBy = "user")
private List<Client> Clients;


@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority(role.name()));
}

@Override
public boolean isAccountNonExpired() {
    return true;
}

@Override
public boolean isAccountNonLocked() {
    return true;
}

@Override
public boolean isCredentialsNonExpired() {
    return true;
}

@Override
public boolean isEnabled() {
    return true;
}
}
