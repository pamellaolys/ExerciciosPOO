package br.com.generation.poo;

public class TestaPaciente {

	public static void main(String[] args) {
	
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Julia");
		paciente1.setIdade(41);
		paciente1.setGenero("Feminino");
		paciente1.setEspecialidade("Ginecologista");
		
		
		paciente1.consulta();
		paciente1.exames();
		paciente1.medicado();
		paciente1.internado();
		paciente1.operado();
		
		System.out.println("=======Paciente 1=======");
		System.out.println("Nome: "+paciente1.getNome());
		System.out.println("Idade: "+paciente1.getIdade());
		System.out.println("Gênero: "+paciente1.getGenero());
		System.out.println("Especialidade: "+paciente1.getEspecialidade());
		
		
		
		
		
	}

}
