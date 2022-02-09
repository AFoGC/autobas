package com.example.autobas.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "route_has_road")
public class RouteHasRoad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route routeInRoadHasRoute;

    @ManyToOne
    @JoinColumn(name = "roads_id")
    private Road roadInRoadHasRoute;
}
