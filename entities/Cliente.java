package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
	
	protected Endereco endereco;
	protected Date dataCadastro;

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
	
	public String toString() {
		return endereco.toString() 
				+ ", " +sdf.format(getDataCadastro());
	}
	

}
