package questao2;

public abstract class Sanduiche {

	private String nome;
	private Pao pao;
	private Queijo queijo;
	private Presunto presunto;
	private Salada salada;
	private SanduichesIngredientFactory fabrica;
	
	public Sanduiche() {
		this.fabrica = null;
		this.nome = "";
	}
	
	public void descricao() {
		System.out.println("Duas fatias de pães");
		System.out.println("Uma fatia de queijo");
		System.out.println("Uma fatia de presunto");
	}
	
	public abstract void preparar();
	
	public void box() {
		System.out.println("Empacota sanduíche");
	}
	
	@Override
	public String toString() {
		String descricao = pao.descricao();
		if(queijo != null) {
			descricao +=", "+queijo.descricao();
		}
		if(presunto != null) {
			descricao +=", "+presunto.descricao();
		}
		if(salada != null) {
			descricao +=", "+salada.descricao();
		}
		return descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SanduichesIngredientFactory getFabrica() {
		return fabrica;
	}

	public void setFabrica(SanduichesIngredientFactory fabrica) {
		this.fabrica = fabrica;
	}
	
	public Pao getPao(){
		return this.pao;
	}
	
	public void setPao(Pao pao){
		this.pao = pao;
	}
	
	public Queijo getQueijo(){
		return this.queijo;
	}
	
	public void setQueijo(Queijo queijo){
		this.queijo = queijo;
	}
	
	public Presunto getPresunto(){
		return this.presunto;
	}
	
	public void setPresunto(Presunto presunto){
		this.presunto = presunto;
	}
	
	public Salada getSalada(){
		return this.salada;
	}
	
	public void setSalada(Salada salada){
		this.salada = salada;
	}
}
