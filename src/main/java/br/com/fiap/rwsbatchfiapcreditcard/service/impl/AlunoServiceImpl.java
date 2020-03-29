package br.com.fiap.rwsbatchfiapcreditcard.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.rwsbatchfiapcreditcard.dto.AlunoDTO;
import br.com.fiap.rwsbatchfiapcreditcard.entity.Aluno;
import br.com.fiap.rwsbatchfiapcreditcard.repository.AlunoRepository;
import br.com.fiap.rwsbatchfiapcreditcard.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	private AlunoRepository alunoRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public AlunoServiceImpl(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	@Override
	public List<AlunoDTO> findAll() {
		List<Aluno> alunoList;
		alunoList = alunoRepository.findAll();

		return alunoList.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	@Override
	public AlunoDTO findById(Integer id) {
		Aluno aluno = getAluno(id);
		AlunoDTO alunoDTO = convertToDto(aluno);
		return alunoDTO;
	}

	@Override
	public AlunoDTO create(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno(alunoDTO.getRm(), alunoDTO.getName());
		alunoRepository.save(aluno);
		return alunoDTO;
	}

	@Override
	public AlunoDTO update(Integer id, AlunoDTO alunoDTO) {
		Aluno aluno = getAluno(id);
		aluno.setRm(alunoDTO.getRm());
		aluno.setName(alunoDTO.getName());
		aluno = alunoRepository.save(aluno);
		alunoDTO = convertToDto(aluno);
		return alunoDTO;
	}

	@Override
	public void delete(Integer id) {
		Aluno aluno = getAluno(id);
		alunoRepository.delete(aluno);
	}

	private Aluno getAluno(Integer id) {
		return alunoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	private AlunoDTO convertToDto(Aluno aluno) {
		AlunoDTO alunoDTO = modelMapper.map(aluno, AlunoDTO.class);
		return alunoDTO;
	}
}