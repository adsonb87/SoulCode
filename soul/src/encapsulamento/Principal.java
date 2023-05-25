package encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Visibilidade v = new Visibilidade();
		
		v.setIdade(20);
		
		System.out.println("Idade: " + v.getIdade());
		
	}

}
