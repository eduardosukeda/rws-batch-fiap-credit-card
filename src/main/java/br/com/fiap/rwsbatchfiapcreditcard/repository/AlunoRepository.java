package br.com.fiap.rwsbatchfiapcreditcard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	Page<Aluno> findAll(Pageable pageable);
}
