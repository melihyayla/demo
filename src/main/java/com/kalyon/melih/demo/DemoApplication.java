package com.kalyon.melih.demo;

import com.kalyon.melih.demo.data.entity.Guest;
import com.kalyon.melih.demo.data.entity.Reservation;
import com.kalyon.melih.demo.data.repository.GuestRepository;
import com.kalyon.melih.demo.data.repository.ReservationRepository;
import com.kalyon.melih.demo.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kalyon.melih.demo.data.entity.Room;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}
 	}

 	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		@Autowired
		private GuestRepository guestRepository;

		@GetMapping
		public Iterable<Guest> getGuests(){
			return this.guestRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/reservation")
	public class ReservationController{
		@Autowired
		private ReservationRepository reservationRepository;

		@GetMapping
		public Iterable<Reservation> getReservation(){
			return this.reservationRepository.findAll();
		}
	}*/

}
