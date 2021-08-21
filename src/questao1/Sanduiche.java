package questao1;

public abstract class Sanduiche {

	public abstract void preparar();
	
	public void descricao() {
		System.out.println("Duas fatias de pães");
		System.out.println("Uma fatia de queijo");
		System.out.println("Uma fatia de presunto");
	}
	
	public void box() {
		System.out.println("Empacota sanduíche na embalagem oficial da Sapore");
	}
}
