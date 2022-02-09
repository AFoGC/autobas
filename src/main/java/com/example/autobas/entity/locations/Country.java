package com.example.autobas.entity.locations;

import lombok.*;

import java.util.List;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //индентифікатор, автогенерування
    private Long id;

    @Column(name = "name")
    private String name;    //назва країни

    @Column(name = "eu_or_schengen_area")
    private boolean eu;     //Schengen Area


    @OneToMany(mappedBy = "country")    //зв'язка один до багатьох, синоніми до країни
    private List<CountrySynonyms> countrySynonyms;

    @OneToMany(mappedBy = "countryInCity")
    private List<City> cityInCountryList;
}
