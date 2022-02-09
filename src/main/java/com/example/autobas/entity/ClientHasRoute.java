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
@Table(name = "client_has_order")
public class ClientHasRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Clients clientInClientHasRoute;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route routeInClientHasRoute;
}
