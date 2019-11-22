
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean transfere(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		if(super.saca(valor)) {			
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
}
