package br.com.fiap.rwsbatchfiapcreditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Student;
import br.com.fiap.rwsbatchfiapcreditcard.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student insert(Student student) {
		return studentRepository.save(student);
	}

	public void delete(Integer id) {
		Student student = new Student();
		student.setId(id);
		studentRepository.delete(student);
	}

	public Student update(Integer id, Student newStudent) {
		return studentRepository.save(newStudent);
	}

	public List<Student> list() {
		return studentRepository.findAll();
	}

	public List<Student> listByCard(Boolean haveCard) {
		return studentRepository.findAllByHaveCard(haveCard);
	}

	public Student get(Integer id) {
		return studentRepository.getOne(id);
	}
}