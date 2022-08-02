package com.HotalManagment.HotalManagment.Models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="HotelDetails")
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
    @Column(nullable = false)
    private String customername;
    @Column(nullable = false)
    private int customerprice;
    @Column(nullable = false)
    private String customeraddress;
}