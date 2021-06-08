package br.com.generation.poo;

public class TestaAviao {

	public static void main(String[] args) {
	
		Aviao aviao1 = new Aviao();
		
		aviao1.setModelo("Boeing 747");
		aviao1.setEmpresa("Latam");
		aviao1.setAssentos(400);
		
		aviao1.decola();
		aviao1.voa();
		aviao1.aterrisa();
		
		System.out.println("Avião 1:");
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getEmpresa());
		System.out.println(aviao1.getAssentos());
		
		
		

	}

}
