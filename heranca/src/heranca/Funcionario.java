package heranca;

public class Funcionario extends Pessoa{

	public Funcionario(String fnome, String fcpf, int fidade) {
		super(fnome, fcpf, fidade);
	}
	
	private int salario;
	private String departamento;
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
