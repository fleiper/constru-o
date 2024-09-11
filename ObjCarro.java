package dpsdaprova;

public class ObjCarro {
	public static void main(String[] args) {
		
		Carro ômega = new Carro ("AZUL",50);
		Carro prisma = new Carro ("BRANCO");
		Carro cruzze = new Carro (50);
		
		
		System.out.println("PLACA DO CARRO: "+ômega.getplaca());
		System.out.println("COR DO CARRO: "+ômega.getcor());
		System.out.println("===========================================");
		
		System.out.println("PLACA DO CARRO: "+prisma.getplaca());
		System.out.println("COR DO CARRO: "+prisma.getcor());
		System.out.println("===========================================");
		
		System.out.println("PLACA DO CARRO: "+cruzze.getplaca());
		System.out.println("COR DO CARRO: "+cruzze.getcor());
		
		
}
}
