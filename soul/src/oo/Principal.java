package oo;

public class Principal {

	public static void main(String[] args) {
		
		Colaborador c = new  Colaborador();
		
		c.nome = "Adson";
		c.idade = 35;
		
		System.out.println("Nome e idade: " + c.nome + " " + c.idade);
	
		c.novaidade(36);
		
		System.out.println("Nome e idade: " + c.nome + " " + c.idade);
		
		System.out.println(c.verificaidade(36));
	}

}
