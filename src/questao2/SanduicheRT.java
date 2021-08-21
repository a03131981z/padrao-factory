package questao2;

public class SanduicheRT extends Sanduiche{

	public SanduicheRT(SanduichesIngredientFactory fabrica) {
		setFabrica(fabrica);
		setNome("Sanduíche riotitensse");
	}
	
	@Override
	public void preparar() {
		System.out.println("Preparando "+super.getNome()+"...");
		setPao(getFabrica().criarPao());
		setQueijo(getFabrica().criarQueijo());
		setPresunto(getFabrica().criarPresunto());
		setSalada(getFabrica().criarSalada());
	}

}
