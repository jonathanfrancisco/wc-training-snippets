package com.whitecloak.training.inventory.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public CategoryEntity() {

    }

    public CategoryEntity(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "category")
    private Set<ItemEntity> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
