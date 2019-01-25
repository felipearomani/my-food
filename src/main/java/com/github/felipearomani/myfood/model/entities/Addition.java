package com.github.felipearomani.myfood.model.entities;

import com.github.felipearomani.myfood.model.entities.food.Food;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

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

    @Column(columnDefinition = "Decimal(10,2) default 00.00")
    private BigDecimal price;

    @Builder
    public Addition(String name, Food food, BigDecimal price) {
        this.name = name;
        this.food = food;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addition addition = (Addition) o;
        return Objects.equals(id, addition.id) &&
                Objects.equals(name, addition.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
