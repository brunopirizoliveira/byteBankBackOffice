
public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		
		cp.deposita(500.0);

		System.out.println("CC Saldo: " + cc.getSaldo());
		System.out.println("CP Saldo: " + cp.getSaldo());		
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC Saldo: " + cc.getSaldo());
		System.out.println("CP Saldo: " + cp.getSaldo());
	}

}
