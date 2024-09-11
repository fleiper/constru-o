package dpsdaprova;

public class Consulta{
	private String nomeDentista;
	private String nomePaciente;
	private String date;


	public Consulta(String nomeDentista, String nomePaciente) {
		this.nomeDentista = nomeDentista;
		this.nomePaciente = nomePaciente;
		this.date = date;
	}
	
	public Consulta(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}
	public void Consulta(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}


	public String getnomeDentista() {
		return nomeDentista;
	}
	public void setnomeDentista() {
		this.nomeDentista= nomeDentista;
	}
	public String getnomePaciente() {
		return nomePaciente;
	}
	public void setnomePaciente() {
		this.nomePaciente = nomePaciente;

	}
	public String getdate() {
		return date;
	}
	public void  setdate() {
		this.date = date;

	}
}
