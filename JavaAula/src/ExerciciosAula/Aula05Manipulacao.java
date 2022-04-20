package ExerciciosAula;

import java.util.Scanner;

public class Aula05Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1212.50;
		String salarioStr = Double.toString(salario);  //Converte de double para String 
		
		System.out.println(salario);
		
		
		String precoTexto = "2.99";
		double preco = Double.parseDouble(precoTexto);   //Converte de String para double   (Parse = passando)
		
		System.out.println(preco);
		
		
	    //double meuDouble = 9.78d;              
	   // int meuInt = (int) meuDouble;
	    
	    //System.out.println(meuDouble);   
	    //System.out.println(meuInt);      //Mostra só o inteiro (9)
	    
	    
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite um valor: ");
	    String numeroTexto = entrada.nextLine();
	    
	    float numero = Float.parseFloat(numeroTexto);
	    System.out.println(numero);
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
