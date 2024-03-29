package questao2;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory{

	@Override
	public Pao criarPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Presunto criarPresunto() {
		return new PresuntoFrango();
	}

	@Override
	public Salada criarSalada() {
		return new SaladaComVerdura();
	}

	

}
