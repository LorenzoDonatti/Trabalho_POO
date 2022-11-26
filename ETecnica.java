package TrabalhoFinal;

public abstract class ETecnica {
	protected String nome;
	protected int idade;
	protected int titulos;
	
	public ETecnica() {
		
	}
	public ETecnica(String nome, int idade, int titulos ) {
		this.nome = nome;
		this.idade = idade;
		this.titulos = titulos;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public int getTitulos() {
		return this.titulos;
	}
	
	public abstract double Avalia();
}
