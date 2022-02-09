package com.example.autobas.entity;

import com.example.autobas.entity.locations.City;

import lombok.*;

import java.util.List;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "driver")
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "mid_name")
    private String midName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private short age;

    @Column(name = "Male")
    private boolean male;

    @Column(name = "on_vacation")
    private boolean onVacation;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City driverLocation;


    @OneToMany(mappedBy = "driversInRoute")
    private List<Route> routeInDriverList;
}
