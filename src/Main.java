
public class Main {

	public static void main(String[] args) {
		
        Cliente cl01 = new Cliente();
        cl01.setNome("Davi José");
        cl01.setSobrenome("Araújo Filho");
        cl01.setCpf("0123456789");
		
		Conta cc = new ContaCorrente(cl01);
		Conta poupanca = new ContaPoupanca(cl01);
		
		cc.depositar(100);
		poupanca.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
