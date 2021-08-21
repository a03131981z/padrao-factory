package questao2;

public abstract class Lanchonete {

	private SanduichesIngredientFactory fabrica;
	
	public Sanduiche pedirSanduiche() {
		Sanduiche sanduiche = criarSanduiche();
		sanduiche.preparar();
		sanduiche.descricao();
		sanduiche.box();
		return sanduiche;
	}
	
	public abstract Sanduiche criarSanduiche();
	
	public SanduichesIngredientFactory getFabrica() {
		return this.fabrica;
	}
	
	public void setFabrica(SanduichesIngredientFactory f) {
		this.fabrica = f;
	}
}
