package classes_abstratas;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.andar();
		c.comer();
		c.setNome("Luffy");
		
		Cavalo ca = new Cavalo();
		ca.andar();
		ca.comer();
		ca.setNome("Hashi");
		
		System.out.println(c.getNome() +" - "+ ca.getNome());
	}

}
