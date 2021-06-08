package br.com.generation.poo;

public class TestaContaBancaria {

	public static void main(String[] args) {
	
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNomeCliente("Reginaldo");
		conta1.setNumeroConta("0547809.8");
		conta1.setSaldo(875.74);
		conta1.setPix(258.33);
		
		conta1.credito();
		conta1.emprestimo();
		conta1.pagamentos();
		conta1.recebimentos();
		conta1.transacoes();
		
		System.out.println("Sua Conta Bancaria");
		System.out.println("Nome: "+conta1.getNomeCliente());
		System.out.println("Numero da conta: "+conta1.getNumeroConta());
		System.out.println("Saldo de: "+conta1.getSaldo());
		System.out.println("Você recebeu um pix no valor de: "+conta1.getPix());
		System.out.println("\nSeu saldo atual é de: ");
		System.out.println(conta1.getSaldo() + conta1.getPix());
	}

}
