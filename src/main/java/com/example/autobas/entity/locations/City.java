package com.example.autobas.entity.locations;

import com.example.autobas.entity.Drivers;
import com.example.autobas.entity.Road;
import lombok.*;

import java.util.List;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private Country countryInCity;


    @OneToMany(mappedBy = "city")
    private List<CitySynonyms> synonyms;

    @OneToMany(mappedBy = "driverLocation")
    private List<Drivers> driversInCityList;

    @OneToMany(mappedBy = "cityFrom")
    private List<Road> cityFromList;


    @OneToMany(mappedBy = "cityTo")
    private List<Road> cityToList;


}
