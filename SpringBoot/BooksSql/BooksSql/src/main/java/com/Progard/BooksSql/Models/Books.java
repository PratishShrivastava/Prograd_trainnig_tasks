package com.Progard.BooksSql.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="BookDetails")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isbn;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String address;
}