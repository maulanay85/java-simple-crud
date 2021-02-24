package com.example.simplecrud.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category")
public class Category extends AuditTrail{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_generator")
    @SequenceGenerator(name = "category_generator", sequenceName = "category_seq", allocationSize = 1, initialValue = 1)
    private Integer id;

    private String categoryName;

    private Boolean isDeleted;
}
