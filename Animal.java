package dpsdaprova;

public class Animal {
	private String cor;
	private float tamanho;

	public Animal(String cor, float tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public Animal(String cor) {
		this.cor = cor;
	}
	public Animal(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getcor() {
		return cor;
	}
	public void setNome() {
		this.cor= cor;
	}
	public float gettamanho() {
		return tamanho;
	}
	public void settamanho() {
		this.tamanho = tamanho;

	}
}

