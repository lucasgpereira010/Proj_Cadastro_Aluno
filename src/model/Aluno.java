package model;

public class Aluno {

	private String nome;
	private String endereco;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getendereco() {
		return endereco;
	}
	
	
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getbairro() {
		return bairro;
	}
	
	public void setcep(long cep) {
		this.cep = cep;
	}
	
	public long getcep() {
		return cep;
	}
	
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getcidade() {
		return cidade;
	}
	
	public void setestado(String estado) {
		this.estado = estado;
	}
	
	public String getestado() {
		return estado;
	}

}


