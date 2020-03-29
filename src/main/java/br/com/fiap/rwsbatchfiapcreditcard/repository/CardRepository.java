package br.com.fiap.rwsbatchfiapcreditcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Student;
import br.com.fiap.rwsbatchfiapcreditcard.entity.Card;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {

	public List<Card> findAllByStudent(Student aluno);
}
