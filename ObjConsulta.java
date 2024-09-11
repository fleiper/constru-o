package dpsdaprova;

public class ObjConsulta {

	public static void main(String[] args) {
		Consulta dent = new Consulta ("PATRICK JANE");
		Consulta panc = new Consulta ("FELLIPE");
		Consulta data = new Consulta ("25.04");
		
		Consulta dent2 = new Consulta ("ADRIANO");
		Consulta panc2 = new Consulta ("ADAUTO");
		Consulta data2 = new Consulta ("12.09");
		
		Consulta dent3 = new Consulta ("CARLOS");
		Consulta panc3 = new Consulta ("ISABELY");
		Consulta data3 = new Consulta ("02.02");
		
		
		System.out.println("NOME DO DENTISTA: "+dent.getnomeDentista());
		System.out.println("COR DO CARRO: "+panc.getnomePaciente());
		System.out.println("DIA DA CONSULTA: "+data.getdate());
		System.out.println("===========================================");
		
		System.out.println("NOME DO DENTISTA: "+dent2.getnomeDentista());
		System.out.println("COR DO CARRO: "+panc2.getnomePaciente());
		System.out.println("DIA DA CONSULTA: "+data2.getdate());
		System.out.println("===========================================");
		
		System.out.println("NOME DO DENTISTA: "+dent3.getnomeDentista());
		System.out.println("COR DO CARRO: "+panc3.getnomePaciente());
		System.out.println("DIA DA CONSULTA: "+data3.getdate());

	}

}
