package conta_bancaria;

public class Conta {
	String nome_cliente;
	int numero_conta;
	int saldo;
	
	void depositar (int valor) {
		int novosaldo = this.saldo + valor;
		this.saldo = novosaldo;
	}
	
	void sacar (int valor) {
		int novovalor = this.saldo - valor;
		this.saldo = novovalor;
	}
	
	boolean verificaSaque(int valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			return true;
		}
	}
	

}
