package com.example.autobas.entity.locations;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "city_synonyms")
public class CitySynonyms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "synonym")
    private String CitySynonym;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;



}
