package com.github.felipearomani.myfood.model.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String title;
    private String description;

    @OneToMany
    private Set<Option> optionals;

//    @OneToMany
//    private Set<Additional> additionals;

    @Column(columnDefinition = "Decimal(10,2)")
    private BigDecimal price;
}
