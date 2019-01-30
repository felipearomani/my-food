package com.github.felipearomani.myfood.model.entities.menuitem;

import com.github.felipearomani.myfood.model.entities.Ingredient;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "menu_items", indexes = {
        @Index(name =  "unique_name", columnList = "name", unique = true)
})
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Getter
    private Long id;

    @Getter
    private String name;

    @ManyToMany
    @JoinTable(
            name = "menu_items_ingredients",
            joinColumns = @JoinColumn(name = "food_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> ingredients;
}
