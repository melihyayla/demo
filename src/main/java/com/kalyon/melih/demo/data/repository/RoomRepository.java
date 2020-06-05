package com.kalyon.melih.demo.data.repository;

import com.kalyon.melih.demo.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {


}
