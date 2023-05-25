package classes_abstratas;

public class Cachorro extends Animal implements Mamifero{

	@Override
	public void comer() {
		System.out.println("Cachorro comendo");
	}

	@Override
	public void andar() {
		System.out.println("Mamifero andando " + passos);		
	}

}
