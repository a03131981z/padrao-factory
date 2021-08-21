package questao2;

public class JPLanchonete extends Lanchonete{
	
	public JPLanchonete() {
		setFabrica(new SanduichesIngredientFactoryJP()
				);
	}

	@Override
	public Sanduiche criarSanduiche() {
		return new SanduicheJP(getFabrica());
	}
}
