package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Documento {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyy");
	
	private Date dataEmissao;
	private String tipo;
	private Double valorTotal;
	private boolean emitido;
	private Cliente cliente;
	private String enderecoDeEntrega;
	
	public Documento() {
		
	}
	
	public Documento(Date dataEmissao, String tipo, Double valorTotal, boolean emitido, Cliente cliente,
			String enderecoDeEntrega) {
		this.dataEmissao = dataEmissao;
		this.tipo = tipo;
		this.valorTotal = valorTotal;
		this.emitido = emitido;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isEmitido() {
		return emitido;
	}

	public void setEmitido(boolean emitido) {
		this.emitido = emitido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(String enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	
	public void emitir() {
		System.out.println("DATA DE EMISSAO:"+ sdf.format(getDataEmissao())+"\n"
				+"TIPO DO DOCUMENTO: "+ getTipo()+"\n"
				+"VALOR TOTAL DA NOTA: "+ getValorTotal()+"\n"
				+"FOI EMTIDO?: "+ isEmitido()+"\n"
				+"CLIENTE DADOS:" + cliente.getDataCadastro()+","+cliente.getEndereco()+"\n"
				+"ENDEREÇO DE ENTREGA: "+ getEnderecoDeEntrega());
	}
	
	
	

}
