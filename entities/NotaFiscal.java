package entities;

import java.util.Date;

public class NotaFiscal extends Documento {
	
	private Double valorTotalImpostos;
	
	public NotaFiscal() {
	}

	public NotaFiscal(Date dataEmissao, String tipo, Double valorTotal, boolean emitido, Cliente cliente,
			String enderecoDeEntrega, Double valorTotalImpostos) {
		super(dataEmissao, tipo, valorTotal, emitido, cliente, enderecoDeEntrega);
		this.valorTotalImpostos = valorTotalImpostos;
	}

	public Double getValorTotalImpostos() {
		return valorTotalImpostos;
	}
 
	public void setValorTotalImpostos(Double valorTotalImpostos) {
		this.valorTotalImpostos = valorTotalImpostos;
	}
	
	@Override
	public void emitir() {
		if (getValorTotalImpostos() > 0) {
			System.out.println("DATA DE EMISSAO:"+ sdf.format(getDataEmissao())+"\n"
					+"TIPO DO DOCUMENTO: "+ getTipo()+"\n"
					+"VALOR TOTAL DA NOTA: "+ getValorTotal()+"\n"
					+"FOI EMTIDO?: "+ isEmitido()+"\n"
					+"CLIENTE DADOS:" + getCliente().getDataCadastro()+","+getCliente().getEndereco()+"\n"
					+"ENDEREÇO DE ENTREGA: "+ getEnderecoDeEntrega());
		}
	}
	
	@Override
	public String toString() {
		return sdf.format(getDataEmissao())+
				", "+getTipo()+
				", "+getValorTotal()+
				", "+ isEmitido()+
				", "+cliente.toString()+
				", "+getEnderecoDeEntrega()+
				", "+getValorTotalImpostos();
	}

}
