package com.example.autobas.entity;

import java.util.List;

import com.example.autobas.entity.locations.City;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "road")
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_from_id")
    private City cityFrom;


    @ManyToOne
    @JoinColumn(name = "city_to_id")
    private City cityTo;


    @Column(name = "road_range")
    private int range;  //int kilometers

    @OneToMany(mappedBy = "roadInRoadHasRoute")
    private List<RouteHasRoad> routeHasRoadList;
}
