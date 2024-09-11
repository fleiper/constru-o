package dpsdaprova;

public class ObjAnimal {
	public static void main(String[] args) {
	Animal cachorro = new Animal ("CARAMELO",5);
	Animal gato = new Animal ("BRANCO");
	Animal burro = new Animal (99);
	
	
	System.out.println("TAMANHO DO CACHORRO: "+cachorro.gettamanho());
	System.out.println("COR DO CACHORRO: "+cachorro.getcor());
	System.out.println("===========================================");
	
	System.out.println("TAMANHO DO GATO: "+gato.gettamanho());
	System.out.println("COR DO GATO: "+gato.getcor());
	System.out.println("===========================================");
	
	System.out.println("TAMANHO DO BURRO: "+burro.gettamanho());
	System.out.println("COR DO BURRO: "+burro.getcor());
	
	
}
}

