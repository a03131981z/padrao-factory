package questao2;

public class CGLanchonete extends Lanchonete{

	public CGLanchonete() {
		setFabrica(new SanduichesIngredientFactoryCG());
	}
	
	@Override
	public Sanduiche criarSanduiche() {
		return new SanduicheCG(getFabrica());
	}

}
