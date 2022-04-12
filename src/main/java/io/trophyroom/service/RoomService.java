package io.trophyroom.service;

import io.trophyroom.entity.Room;
import io.trophyroom.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoomService {

	private final RoomRepository roomRepository;

	// Always check exist before add new
	public void addRoom() {
		Room room = new Room();
		room.setId(123);
		room.setName("room 1");
		roomRepository.save(room);
	}
}