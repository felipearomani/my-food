package com.github.felipearomani.myfood.model.entities;

import com.github.felipearomani.myfood.model.entities.menuitem.MenuItem;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ingredients")
    private List<MenuItem> food;

    @Column(columnDefinition = "Decimal(10,2) default 00.00")
    private BigDecimal price;
}
