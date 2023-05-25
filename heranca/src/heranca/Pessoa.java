package heranca;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa(String pnome, String pcpf, int pidade) {
		this.nome = pnome;
		this.cpf = pcpf;
		this.idade = pidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
