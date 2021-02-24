package com.example.simplecrud.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "merchant")
public class Merchant extends AuditTrail{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merchant_generator")
    @SequenceGenerator(name = "merchant_generator", sequenceName = "merchant_seq", allocationSize = 1, initialValue = 1)
    private Integer id;

    private String merchantName;

    private String merchantCode;

    private Boolean isDeleted;

    @ManyToMany(mappedBy = "merchants")
    private Set<Product> product;
}
