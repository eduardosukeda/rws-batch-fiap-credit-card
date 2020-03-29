package br.com.fiap.rwsbatchfiapcreditcard.dto;

public class AlunoDTO {

	private Integer id;
	private String rm;
	private String name;

	public AlunoDTO() {

	}

	public AlunoDTO(Integer id, String rm, String name) {
		this.id = id;
		this.rm = rm;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}