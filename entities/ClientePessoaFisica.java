package entities;

import java.util.Date;

public class ClientePessoaFisica extends Cliente {
	
	private String nome;
	private Date dataNascimento;
	private String cpf;
	
	public ClientePessoaFisica() {
		
	}
	
	public ClientePessoaFisica(Endereco endereco, Date dataCadastro, String nome, Date dataNascimento, String cpf) {
		super(endereco, dataCadastro);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}


}
