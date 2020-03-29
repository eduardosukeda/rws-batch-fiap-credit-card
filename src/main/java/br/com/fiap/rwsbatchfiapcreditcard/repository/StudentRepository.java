package br.com.fiap.rwsbatchfiapcreditcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findAllByHaveCard(Boolean haveCard);
}