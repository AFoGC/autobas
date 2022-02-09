package com.example.autobas.entity;

import lombok.*;

import java.util.List;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    /*
    @Column(name = "verified")
    private boolean verified;
    */

    @OneToMany(mappedBy = "clientInClientHasRoute")
    private List<ClientHasRoute> clientHasRouteInClientList;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id")
    private Users users;
}
