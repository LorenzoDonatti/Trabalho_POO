package TrabalhoFinal;

public class Jogador extends ETecnica implements Comparable<Jogador>{
	protected int gols;
	protected int semSofrerGols;
	protected String posic;
	protected double avalia;

	public Jogador(String nome, int idade, int titulos, int gols, 
			int semSofrerGols, String posic) {
		super(nome, idade, titulos);
		this.gols = gols;
		this.semSofrerGols = semSofrerGols;
		this.posic = posic;
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
	public int getGols() {
		return this.gols;
	}
	public int getSemSofrerGols() {
		return this.semSofrerGols;
	}
	public String getPosic() {
		return this.posic;
	}	
	public double Avalia() {
		if(posic.equalsIgnoreCase("def")) {
			avalia = (titulos*semSofrerGols)/idade;
		}
		else if(posic.equalsIgnoreCase("mei")) {
			avalia = (titulos*semSofrerGols*gols)/(idade*2);
		}
		else if(posic.equalsIgnoreCase("ata")) {
			avalia = (titulos*gols)/idade;
		}
		return this.avalia;
	}
	public int compareTo(Jogador o) {
	    return nome.compareTo(o.getNome());
	}

}
