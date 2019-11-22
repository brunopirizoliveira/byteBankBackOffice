

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;		
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
		
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public abstract boolean transfere(double valor, Conta contaDestino);
}
