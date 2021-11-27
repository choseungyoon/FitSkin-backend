package com.fitksin.server.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name="moisturizing")
    private int moisturizing;

    @Column(name="sebum")
    private int sebum;

    @Column(name="sensitivity")
    private int sensitivity;

    @Column(name="elasticity")
    private int elasticity;

    @Column(name="pigmentation")
    private int pigmentation;

    @Column(name="trouble")
    private int trouble;

}
