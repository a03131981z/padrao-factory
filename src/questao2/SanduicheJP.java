package questao2;

public class SanduicheJP extends Sanduiche{

	public SanduicheJP(SanduichesIngredientFactory fabrica) {
		setFabrica(fabrica);
		setNome("Sanduíche pessoense");
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
