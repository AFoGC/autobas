package com.example.autobas.entity.locations;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "country_synonyms")
public class CountrySynonyms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "synonym")
    private String CountySynonym;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
