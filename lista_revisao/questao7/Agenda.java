package questao7;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public Agenda(Contato contato) {
		this.contatos.add(contato);
	}
	
	public void adicionar_contato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public Contato buscar_contato(String nome) {
		Contato contato_buscado = null;
		for (int i = 0; i < this.contatos.size(); i++) {
			if (this.contatos.get(i).getNome() == nome) {
				contato_buscado = this.contatos.get(i);
				return contato_buscado;
			}
		}
		return contato_buscado;
	}
	
	public boolean remover_contato(String nome) {
		for (int i = 0; i < this.contatos.size(); i++) {
			if (this.contatos.get(i).getNome() == nome) {
				this.contatos.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void listar_agenda() {
		for (int i = 0; i < this.contatos.size(); i++) {
			System.out.println("\n"
					+ "Contato " + (i+1));
			System.out.println("Nome: " + this.contatos.get(i).getNome());
			System.out.println("Email: " + this.contatos.get(i).getEmail());
			System.out.println("==================");
		}
	}
}
