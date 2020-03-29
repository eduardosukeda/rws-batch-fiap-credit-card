package br.com.fiap.rwsbatchfiapcreditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Student;
import br.com.fiap.rwsbatchfiapcreditcard.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping
	public Student create(@RequestBody Student student) {
		return studentService.insert(student);
	}

	@DeleteMapping("/{id}")
	public void delete(@RequestParam Integer id) {
		studentService.delete(id);
	}

	@GetMapping
	public List<Student> list(@RequestParam(required = false) Boolean haveCard) {
		if (haveCard == null) {
			return studentService.list();
		}

		return studentService.listByCard(haveCard);
	}
}
