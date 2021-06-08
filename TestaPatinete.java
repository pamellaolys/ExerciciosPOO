package br.com.generation.poo;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete();
		
		
		patinete1.setModelo("Patinete Town 5XL");
		patinete1.setFabricante("Oxelo");
		patinete1.setCor("Preto");
		
		patinete1.deslocamento();
		patinete1.freia();
		
		System.out.println("Patinete 1:");
		System.out.println("\nModelo: "+patinete1.getModelo());
		System.out.println("Fabricante: "+patinete1.getFabricante());
		System.out.println("Cor: "+patinete1.getCor());
	}

}
