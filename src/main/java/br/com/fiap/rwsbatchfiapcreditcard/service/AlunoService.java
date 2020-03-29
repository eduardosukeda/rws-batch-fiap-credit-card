package br.com.fiap.rwsbatchfiapcreditcard.service;

import java.util.List;

import br.com.fiap.rwsbatchfiapcreditcard.dto.AlunoDTO;

public interface AlunoService {

	public List<AlunoDTO> findAll();

	public AlunoDTO findById(Integer id);

	public AlunoDTO create(AlunoDTO alunoDTO);

	public AlunoDTO update(Integer id, AlunoDTO alunoDTO);

	public void delete(Integer id);
}