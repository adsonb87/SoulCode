package heranca;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f;
		
		f = new Funcionario("Adson","07114991444", 35);
		f.setDepartamento("TI");
		f.setSalario(3000);
		
		System.out.println("Nome do funcionario: " + f.getNome());
		System.out.println("CPF do funcionario: " + f.getCpf());
		System.out.println("Idade do funcionario: " + f.getIdade());
		System.out.println("Departamento do funcionario: " + f.getDepartamento());
		System.out.println("Salario do funcionario: " + f.getSalario());
		

	}

}
