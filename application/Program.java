package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ClientePessoaFisica;
import entities.ClientePessoaJuridica;
import entities.Endereco;
import entities.NotaFiscal;
import entities.Orcamento;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do endereço:");
		System.out.println("LOGRADOURO:");
		String logradouro = sc.nextLine();
		System.out.println("BAIRRO:");
		String bairro = sc.nextLine();
		System.out.println("CIDADE:");
		String cidade = sc.nextLine();
		System.out.println("ESTADO:");
		String estado = sc.nextLine();
		Endereco endereco = new Endereco(logradouro,bairro,cidade,estado);
		
		System.out.println(endereco);
		
		System.out.println("Digite dados do cliente:");
		System.out.println("DIGITE (1) PARA PESSOA FISICA OU (2) PARA PESSOA JURÍDICA;");
		int opcao = sc.nextInt();
		Cliente clientePF = null;
		Cliente clientePJ = null;
		if (opcao ==1) {
			 System.out.println("DATA DE CADASTRO:");
			 Date dataCadastro = sdf.parse(sc.next());			 
			 System.out.println("NOME:");
			 String nome = sc.next();
			 System.out.println("DATA DE NASCIMENTO (dd/mm/yyyy):");
			 Date dataNascimento = sdf.parse(sc.next());
			 System.out.println("CPF:");
			 String cpf = sc.next(); 
			 
			 clientePF = new ClientePessoaFisica (endereco,dataCadastro,nome,dataNascimento,cpf);
			 System.out.println(clientePF);
		}
		else if(opcao ==2) {
			System.out.println("DATA DE CADASTRO:");
			 Date dataCadastro = sdf.parse(sc.next());
			 System.out.println("RAZÃO SOCIAL:");
			 String razaoSocial = sc.next();
			 System.out.println("NOME FANTASIA:");
			 String fantasia = sc.next();
			 System.out.println("CNPJ:");
			 String cnpj = sc.next();
			 System.out.println("DATA REGISTRO:");
			 Date dataRegistro = sdf.parse(sc.next());
			 
			 clientePJ = new ClientePessoaJuridica(endereco,dataCadastro,razaoSocial,fantasia,cnpj,dataRegistro);
			 System.out.println(clientePJ);
		}
		else {
			System.out.println("Opção não válida!");
		}
		
		System.out.println("DiGITE O TIPO DE DOCUMENTO A SER GERADO, \n"
				+ " (1) NOTA FISCAL, (2) ORÇAMENTO:");
		int op = sc.nextInt();
		if (op ==1) {
			System.out.println("DATA EMISSAO:");
			Date dataEmissao = sdf.parse(sc.next());
			System.out.println("DIGITE O TIPO (PEDIDO OU NOTA):");
			String tipo = sc.next();
			System.out.println("VALOR TOTAL DA NOTA:");
			Double valorTotal = sc.nextDouble();
			boolean emitido = false;
			Cliente cliente=null;
			if(opcao == 1) {
			 cliente = clientePF;
			}
			else {
			 cliente = clientePJ;
			}
			System.out.println("ENDERECO DE ENTREGA:");		
			String enderecoDeEntrega = sc.next();
			System.out.println("VALOR TOTAL DO IMPOSTO:");
			Double valorTotalImposto = sc.nextDouble();
			NotaFiscal notaFiscal = new NotaFiscal(dataEmissao,tipo,valorTotal,emitido,cliente,enderecoDeEntrega,valorTotalImposto);
			System.out.println(notaFiscal);
		}
		if(opcao == 2) {
			System.out.println("DATA EMISSAO:");
			Date dataEmissao = sdf.parse(sc.next());
			System.out.println("DIGITE O TIPO (PEDIDO OU NOTA):");
			String tipo = sc.next();
			System.out.println("VALOR TOTAL DA NOTA:");
			Double valorTotal = sc.nextDouble();
			boolean emitido = false;
			Cliente cliente=null;
			if(opcao == 1) {
			 cliente = clientePF;
			}
			else {
			 cliente = clientePJ;
			}
			System.out.println("ENDERECO DE ENTREGA:");
			String enderecoDeEntrega = sc.next();
			System.out.println("DATA DE VALIDADE:");
			Date dataValidade = sdf.parse(sc.next());
			Orcamento orcamento = new Orcamento(dataEmissao,tipo,valorTotal,emitido,cliente,enderecoDeEntrega,dataValidade);
			System.out.println(orcamento);
		}
		
		
		sc.close(); 

	}

}
