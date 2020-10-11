package com.pd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Book {


    @Id
    @GeneratedValue
    private int bookId;

    @Column
    private String name;

    @Column
    private String author;

    @Column
    private float price;



}
