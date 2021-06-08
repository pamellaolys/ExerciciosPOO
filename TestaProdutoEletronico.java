package br.com.generation.poo;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
	
		ProdutoEletronico celular1 = new ProdutoEletronico();
		ProdutoEletronico celular2 = new ProdutoEletronico();
		
		celular1.setNome("Redmi");
		celular1.setModelo("Note 9");
		celular1.setFabricante("Xiaomi");
		celular1.setQuantidadeCamera(4);
		
		celular2.setNome("Iphone");
		celular2.setModelo("12 PRO Max");
		celular2.setFabricante("Apple");
		celular2.setQuantidadeCamera(3);
		
		celular1.fazLigacao();
		celular1.recebeLigacao();
		celular1.acessoInternet();
		celular1.tiraFotos();
		
		System.out.println("Celular 1");
		System.out.println(celular1.getNome());
		System.out.println(celular1.getModelo());
		System.out.println(celular1.getFabricante());
		System.out.println(celular1.getQuantidadeCamera());
		System.out.println("");
		System.out.println("Celular 2 ");
		System.out.println(celular2.getNome());
		System.out.println(celular2.getModelo());
		System.out.println(celular2.getFabricante());
		System.out.println(celular2.getQuantidadeCamera());
		
	}
	

}
