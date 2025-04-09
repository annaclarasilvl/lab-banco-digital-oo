
public class Main {

	public static void main(String[] args) {
		Cliente anna = new Cliente();
		anna.setNome("Anna");
		Cliente clara = new Cliente();
		clara.setNome("Clara");
		
		Conta cc = new ContaCorrente(anna);
		Conta poupanca = new ContaPoupanca(clara);

		cc.depositar(1280.21);
		cc.transferir(681.75, poupanca);

		poupanca.sacar(380.50);
		
		cc.sacar(800);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.inputConta(cc);
		banco.inputConta(poupanca);
		banco.mostrarContas();
	}

}
