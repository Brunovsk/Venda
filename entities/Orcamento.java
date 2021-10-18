package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Orcamento extends Documento{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
	
	private Date dataValidade;
	
	public Orcamento() {
	}

	public Orcamento(Date dataEmissao, String tipo, Double valorTotal, boolean emitido, Cliente cliente,
			String enderecoDeEntrega, Date dataValidade) {
		super(dataEmissao, tipo, valorTotal, emitido, cliente, enderecoDeEntrega);
		this.dataValidade = dataValidade;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	@Override
	public void emitir() {
		
			Date dataHj = new Date();
			long dataValida = dataHj.getTime() - dataValidade.getTime();
			TimeUnit.DAYS.convert(dataValida, TimeUnit.MILLISECONDS);
		if (dataValida < 0) {
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
				", "+sdf.format(getDataValidade());
	}

}
