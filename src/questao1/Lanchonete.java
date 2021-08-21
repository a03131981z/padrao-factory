package questao1;

public abstract class Lanchonete {

	public Sanduiche pedirSanduiche() {
		Sanduiche sanduiche = criarSanduiche();
		sanduiche.preparar();
		sanduiche.descricao();
		sanduiche.box();
		return sanduiche;
	}
	
	public abstract Sanduiche criarSanduiche();
}
