package slide2Part2;

public class Conta {
	private String nome;
	private double valor;
	
	public Conta(String nome, int valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
        return "Conta [Nome: " + nome + ", Valor: R$ " + valor + "]";
    }
}
