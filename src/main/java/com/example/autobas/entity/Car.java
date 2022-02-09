package com.example.autobas.entity;

import com.example.autobas.entity.locations.City;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "cars") //зв’язувавння таблиць з класами
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_number")
    private String carNumber;

    @Column(name = "free_places")
    private short freePlaces;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "last_technical_inspection")
    private Date lastTechnicalInspection;

    @Column(name = "in_exploitation")
    private boolean inExploitation;

    @Column(name = "color")
    private String color;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City location;


    @OneToMany(mappedBy = "carInRoute")
    private List<Route> routeInCarList;


    //может быть, сделаю ещё отдельный абстрактный класс для машин
}
