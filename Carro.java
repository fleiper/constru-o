package dpsdaprova;

public class Carro {
	private String cor;
	private int placa;

	public Carro(String cor, int placa) {
		this.cor = cor;
		this.placa= placa;
	}
	public Carro(String cor) {
		this.cor = cor;
	}
	public Carro(int placa) {
		this.placa = placa;
	}
	public String getcor() {
		return cor;
	}
	public void setNome() {
		this.cor= cor;
	}
	public int getplaca() {
		return placa;
	}
	public void setplaca() {
		this.placa = placa;

	}
}
