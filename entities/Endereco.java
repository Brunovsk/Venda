package entities;

public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco() {
		
	}
	
	public Endereco(String logradouro, String bairro, String cidade, String estado) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ENDERE?O:"+getLogradouro()
		+", "+getBairro()
		+", "+getCidade()+
		", "+getEstado();
	}
	
	public static Endereco addEndereco(String logradouro, String bairro, String cidade, String estado) {
		Endereco endereco = new Endereco();
		endereco.logradouro = logradouro;
		endereco.bairro = bairro;
		endereco.cidade = cidade;
		endereco.estado = estado;
		return endereco;
		
	}
	
	

}
