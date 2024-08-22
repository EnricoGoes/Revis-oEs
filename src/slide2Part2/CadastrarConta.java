package slide2Part2;

import java.util.ArrayList;

public class CadastrarConta {
	
	private ArrayList<Conta> contas;
	
	public CadastrarConta() {
		contas = new ArrayList<>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void listarContas() {
		if(contas.isEmpty()) {
			System.out.println("Nenhuma conta cadastrada: ");
		} else {
			for(Conta conta: contas) {
				System.out.println(conta);
			}
		}
	}
	
	public Conta procurarConta(String nome){
		for(Conta conta: contas) {
			if(conta.getNome().equalsIgnoreCase(nome)) {
				return conta;
			}
		}
		return null;
	}
}
