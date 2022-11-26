package TrabalhoFinal;

public class Treinador extends ETecnica implements Comparable<Treinador>{
	protected String estiloJogo;
	protected int experiencia;
	protected int gestaoDeElenco;
	
	
	public Treinador(String nome, int idade, int titulos, 
			String estiloJogo, int experiencia, int gestaoDeElenco) {
		super(nome, idade, titulos);
		this.estiloJogo = estiloJogo;
		this.experiencia = experiencia;
		this.gestaoDeElenco = gestaoDeElenco;
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
	public String getEstiloJogo() {
		return this.estiloJogo;
	}
	public int getExperiencia() {
		return this.experiencia;
	}
	public int getGestaoDeElenco() {
		return this.gestaoDeElenco;
	}
	public double Avalia() {
		return this.titulos*experiencia*gestaoDeElenco/9;
	}
	public int compareTo(Treinador o) {
	    return nome.compareTo(o.getNome());
	}

}
