package br.com.generation.poo;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.setNome("Anna");
		cliente1.setIdade(20);
		
		cliente2.setNome("Maria");
		cliente2.setIdade(30);
		
		cliente1.escolheProduto();//"uma blusa preta e uma blusa branca"
		cliente1.provaProduto();//"fica com a blusa preta"
		cliente1.pagaProduto();//"paga 50 reais"
	
		System.out.println("Cliente 1");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		
		System.out.println("Cliente 2");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getIdade());
		
	}

}
