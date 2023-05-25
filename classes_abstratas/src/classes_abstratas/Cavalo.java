package classes_abstratas;

public class Cavalo extends Animal implements Mamifero{

	@Override
	public void comer() {
		System.out.println("Cavalo comendo");
	}

	@Override
	public void andar() {
		System.out.println("Mamifero andando " + passos);
		
	}

}
