package com.in2.superHeroe.SuperHeroe.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="superheroes")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SuperHero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name="super_hero_name")
    private String superHeroName;
}
