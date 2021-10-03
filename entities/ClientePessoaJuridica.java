package entities;

import java.util.Date;

public class ClientePessoaJuridica extends Cliente {
	
	private String razaoSocial;
	private String fantasia;
	private String cnpj;
	private Date dataRegistro;
	
	public ClientePessoaJuridica() {
		
	}
	
	public ClientePessoaJuridica(Endereco endereco, Date dataCadastro, String razaoSocial, String fantasia, String cnpj,
			Date dataRegistro) {
		super(endereco, dataCadastro);
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.dataRegistro = dataRegistro;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

}
