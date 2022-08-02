package com.HotalManagment.HotalManagment.Repository;

import com.HotalManagment.HotalManagment.Models.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotels, Integer> {
}