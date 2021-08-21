package questao2;

public class SanduicheCG extends Sanduiche{

	public SanduicheCG(SanduichesIngredientFactory fabrica) {
		setFabrica(fabrica);
		setNome("Sanduíche campinense");
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
