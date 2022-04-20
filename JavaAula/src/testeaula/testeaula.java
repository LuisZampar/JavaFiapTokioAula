package testeaula;

import java.util.Scanner;

public class testeaula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = entrada.nextLine();
		//System.out.println(nome);
		
		int idade = 17;
		//System.out.println(idade);
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		//System.out.println(idade);
		
		System.out.println("");
		
		System.out.println("Olá, " + nome + "! Você tem " + idade +" anos.");
		
		entrada.close(); //Se quiser

	}

}






