package dpsdaprova;

public class ObjPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa ("Fulano",50);
		Pessoa pessoa2 = new Pessoa (8);
		Pessoa pessoa3 = new Pessoa ("fellipe");
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa3.getIdade());
		System.out.println(pessoa3.getNome());


	}
}
