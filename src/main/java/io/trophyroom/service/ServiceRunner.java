package io.trophyroom.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceRunner implements CommandLineRunner {

	private final StudentService studentService;
	private final RoomService roomService;

	@Override
	public void run(String... args) {
//		roomService.addRoom();
//		studentService.addStudent();
//		studentService.fetchRoomWithStudent();
//		studentService.updateAllStudentColumn();
//		studentService.getEntityAndSave();
	}
}
