
public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		double valorAsacar = valor + 0.2;		
		return super.saca(valorAsacar);
	}

	@Override
	public boolean transfere(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		if(this.saca(valor)) {			
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
}
