package polimorfismo;

public class Veiculo extends Transporte{
	
	public void andar() {
		System.out.println("Veiculo andando");
	}
	
	public void andar(int qtdkm) {
		System.out.println("Veiculo andando a " + qtdkm + " Km/h");
	}
	
	public void andar(int qtdkm, int qtdl) {
		System.out.println("Veiculo andando a " + qtdkm + " Km/h e gastando " + qtdl + " km/l");
	}
}
