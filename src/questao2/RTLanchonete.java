package questao2;

public class RTLanchonete extends Lanchonete{
	
	public RTLanchonete() {
		setFabrica(new SanduichesIngredientFactoryRT());
	}

	@Override
	public Sanduiche criarSanduiche() {
		return new SanduicheRT(getFabrica());
	}

}
