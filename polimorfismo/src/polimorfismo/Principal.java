package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Transporte t = new Transporte();
		Veiculo v = new Veiculo();
		Carro c = new Carro();
		
		t.andar();
		v.andar();
		c.andar();
		
		v.andar(85);
		v.andar(85,12);
	}

}
