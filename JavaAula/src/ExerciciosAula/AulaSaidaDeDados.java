package ExerciciosAula;

public class AulaSaidaDeDados {

	public static void main(String[] args) {
		
		float nota = 8.2f;
		
		System.out.println("O miguel tirou: " + nota);
		System.out.printf("O Miguel tirou: %.2f \n", nota);     // "\n : Pula linha"
		System.out.format("O Miguel tirou: %.1f \n", nota);        // ".1f : Uma casa Decimal"
		
		String nome = "Arthur";
		
		System.out.printf("O %s tirou: %.3f", nome, nota);       // %s é String, % = (vai receber um valor formatado)
		
		
		
		
		
		
		
	}

}
