package com.restaurantes.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
@Table(name = "dishes")
@AllArgsConstructor
@ToString


public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Boolean active;

    @Column(length = 500)
    private String description;
    private String imageUrl;


    @Enumerated(EnumType.STRING)
    private FoodType foodType;


    @ToString.Exclude // lombok
    @ManyToOne // JPA
    private Restaurant restaurant;

}
