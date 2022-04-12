package io.trophyroom.service;

import io.trophyroom.entity.Student;
import io.trophyroom.repository.RoomRepository;
import io.trophyroom.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentService {

	private final StudentRepository studentRepository;
	private final RoomRepository roomRepository;

	// Need to fetch room to update
	public void addStudent() {
		Student student = new Student();
		student.setId(123);
		student.setName("thien");
		student.setPhone("+84123456");
		student.setRoom(roomRepository.findById(123).get());
		studentRepository.save(student);
	}

	// Auto fetch student
	public void fetchRoomWithStudent() {
		Optional<Student> studentOptional = studentRepository.findById(123);
		if (studentOptional.isPresent()) {
			System.out.println(studentOptional.get().getName());
		}
	}

	// Update all column and ferch before update
	public void updateAllStudentColumn() {
		Optional<Student> studentOptional = studentRepository.findById(123);
		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			student.setName("thien nguyen");
			studentRepository.save(student);
		}
	}

	// Update all column and fetch before update
	@Transactional
	public void getEntityAndSave() {
		Student student = new Student();
		student.setId(123);
		student.setName("thien");
		student.setPhone("+84123456");
		student.setRoom(roomRepository.findById(123).get());
		studentRepository.save(student);
	}
}