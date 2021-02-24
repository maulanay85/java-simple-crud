package com.example.simplecrud.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "product")
public class Product extends AuditTrail{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name = "product_generator", allocationSize = 1, initialValue = 1)
    private Integer id;

    private String productName;

    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable
    private Set<Merchant> merchants;

}
