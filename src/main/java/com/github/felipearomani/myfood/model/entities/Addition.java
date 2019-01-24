package com.github.felipearomani.myfood.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "additions")
public class Addition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    @Column(columnDefinition = "boolean default false")
    private Boolean required;

    @Column(columnDefinition = "Decimal(10,2) default 00.00")
    private BigDecimal price;

    @Builder
    public Addition(String name, Food food, Boolean required, BigDecimal price) {
        this.name = name;
        this.food = food;
        this.required = required;
        this.price = price;
    }
}
