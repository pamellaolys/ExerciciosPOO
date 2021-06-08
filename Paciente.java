package br.com.generation.poo;

public class Paciente {

	//atributos
		private String nome;
		private int idade;
		private String genero;
		private String especialidade;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getEspecialidade() {
			return especialidade;
		}
		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}
		//método
		void consulta() {
		}
		void exames() {
		}
		void operado() {
		}
		void medicado() {
		}
		void internado() {
		}
}
