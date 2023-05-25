package oo;

public class Colaborador {
	String nome;
	int identificador;
	int idade;
	int telefone;
	String departamento;
	
	void novaidade(int novaidade) {
		this.idade = novaidade;
	}
	
	boolean verificaidade(int idade) {
		if(idade >50 ) {
			return true;
		}else {
			return false;
		}
	}
}
