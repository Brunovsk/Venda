package application;

import java.util.Scanner;

import entities.Endereco;

public class Program {

	public static void main(String[] args) {
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
		
		System.out.println(endereco.toString());
		
		
		sc.close(); 

	}

}
