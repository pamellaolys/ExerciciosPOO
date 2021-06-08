package br.com.generation.poo;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Paulo");
		funcionario1.setIdade(40);
		funcionario1.setCadastroFuncionario(105);
		funcionario1.setFuncao("Auxiliar Administrativo");
		funcionario1.setHorarioEntrada(7);
		funcionario1.setHorarioSaida(17);
		
		
		funcionario1.bateCartao();
		funcionario1.exerceFuncao();
		funcionario1.almoca();
		funcionario1.exerceFuncao2();
		funcionario1.batecartao2();
		
		
		System.out.println("Funcionario 1");
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getIdade());
		System.out.println(funcionario1.getCadastroFuncionario());
		System.out.println(funcionario1.getFuncao());
		System.out.println(funcionario1.getHorarioEntrada());
		System.out.println(funcionario1.getHorarioSaida());
		
	}

}
