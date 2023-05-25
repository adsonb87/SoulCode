package conta_bancaria;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		 c1.nome_cliente = "Adson";
		 c1.numero_conta = 7907;
		 c1.saldo = 0;
		 
		 System.out.println("------------------------");
		 System.out.println("Nome: " + c1.nome_cliente);
		 System.out.println("Numero da conta: " + c1.numero_conta);
		 System.out.println("Saldo: " + c1.saldo);
		 System.out.println("------------------------");
		 
		 c1.depositar(100);
		 System.out.println("------------------------");
		 System.out.println("Nome: " + c1.nome_cliente);
		 System.out.println("Numero da conta: " + c1.numero_conta);
		 System.out.println("Saldo: " + c1.saldo);
		 System.out.println("------------------------");
		 
		 if(c1.verificaSaque(100)) {
			 c1.sacar(100);
		 }else {
			 System.out.println("Saldo insuficiente !");
		 }
		 
		 System.out.println("------------------------");
		 System.out.println("Nome: " + c1.nome_cliente);
		 System.out.println("Numero da conta: " + c1.numero_conta);
		 System.out.println("Saldo: " + c1.saldo);
		 System.out.println("------------------------");
		 
		 System.out.println("-----VERIFICA SALDO-----");
		 System.out.println(c1.verificaSaque(c1.saldo));
	}

}
