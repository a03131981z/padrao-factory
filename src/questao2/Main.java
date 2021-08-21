package questao2;

public class Main {

	public static void main(String args[]) {
		Lanchonete lanchonete = null;
		Sanduiche sanduiche = null;
		
		System.out.println("No estilo de Rio Tinto:\n");
		lanchonete = new RTLanchonete();
		sanduiche = lanchonete.pedirSanduiche();
		System.out.println(sanduiche);
		
		System.out.println("\nNo estilo de Joao Pessoa:\n");
		lanchonete = new JPLanchonete();
		sanduiche = lanchonete.pedirSanduiche();
		System.out.println(sanduiche);
		
		System.out.println("\nNo estilo de Campina Grande:\n");
		lanchonete = new CGLanchonete();
		sanduiche = lanchonete.pedirSanduiche();
		System.out.println(sanduiche);
	}
}
