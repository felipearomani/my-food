package com.github.felipearomani.myfood.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "foods", indexes = {
        @Index(name =  "unique_name", columnList = "name", unique = true)
})
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Getter
    private Long id;

    @Getter
    private String name;

    @Getter
    private String description;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Option> optionals = new HashSet<>();

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Addition> additions = new HashSet<>();

    @Column(columnDefinition = "Decimal(10,2)")
    @Getter
    private BigDecimal price;

    @Builder
    public Food(String name, String description, Set<Option> optionals, Set<Addition> additions, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.optionals = optionals;
        this.additions = additions;
        this.price = price;
    }

    public Set<Option> getOptionals() {
        return Set.copyOf(optionals);
    }

    public Set<Addition> getAdditions() {
        return Set.copyOf(additions);
    }

    public void putAddition(Addition addition) {
        additions.add(addition);
    }

    public void putOptional(Option option) {
        optionals.add(option);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
