package com.kalyon.melih.demo.data.repository;

import com.kalyon.melih.demo.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
