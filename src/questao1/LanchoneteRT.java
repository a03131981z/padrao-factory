package questao1;

public class LanchoneteRT extends Lanchonete{

	@Override
	public Sanduiche criarSanduiche() {
		return new SanduicheRT();
	}

}
