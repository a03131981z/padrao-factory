package questao1;

public class Main {

	public static void main(String args[]) {
		
		Lanchonete lanchonete = null;
		Sanduiche sanduiche = null;
		lanchonete = new LanchoneteJP();
		lanchonete.criarSanduiche();
		sanduiche = new SanduicheJP();
		sanduiche.preparar();
		lanchonete.pedirSanduiche();
		
		lanchonete = new LanchoneteCG();
		lanchonete.criarSanduiche();
		sanduiche = new SanduicheCG();
		System.out.println("\n---------------------------------------------------------------------------\n");
		sanduiche.preparar();
		lanchonete.pedirSanduiche();
	}
}
