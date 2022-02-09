package com.example.autobas.entity;

import com.example.autobas.entity.locations.City;

import java.util.Date;
import java.util.List;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "route_time")
    private int timeInMinutes; //in minutes


    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car carInRoute;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Drivers driversInRoute;

    /*
    @ManyToOne
    @JoinColumn(name = "city_from_id")
    private City cityFrom;

    @ManyToOne
    @JoinColumn(name = "city_to_id")
    private City cityTo;
    */

    @OneToMany(mappedBy = "roadInRoadHasRoute")
    private List<RouteHasRoad> routeHasRoadList;

    @OneToMany(mappedBy = "routeInClientHasRoute")
    private List<ClientHasRoute> clientHasRouteInRouteList;
}
