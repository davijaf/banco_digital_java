
public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private static final int SALDO_PADRAO = 0;
	
	
	protected Cliente cliente;
	protected String Sobrenome;
	protected String cpf;
	protected int agencia;
	protected int numero;
	protected double saldo;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
        this.saldo = SALDO_PADRAO;
        this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s %s", cliente.getNome(), cliente.getSobrenome()));
		System.out.println(String.format("CPF: %s", cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("********************************"));
	}
}
