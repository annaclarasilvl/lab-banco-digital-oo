import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	Cliente cliente = new Cliente();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void inputConta(Conta c) {
		contas.add(c);
	}

	public void mostrarContas() {
		
			System.out.println("Número de contas abertas no banco: " + contas.size());

	}
}
