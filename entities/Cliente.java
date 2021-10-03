package entities;

import java.util.Date;

public class Cliente {
	
	private Endereco endereco;
	private Date dataCadastro;

	public Cliente() {
	}
	
	public Cliente(Endereco endereco, Date dataCadastro) {
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
	

}
