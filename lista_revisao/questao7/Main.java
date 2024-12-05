package questao7;

public class Main {
	public static void main(String []args) {
		Contato carol = new Contato("Carol", "carol@email.com");
		Contato paula = new Contato("Paula", "paula@email.com");
		
		Agenda agenda = new Agenda(carol);
		agenda.adicionar_contato(paula);
		
		agenda.listar_agenda();
		
		Contato contato_buscado = agenda.buscar_contato("Carol");
		if (contato_buscado != null) {
			System.out.println("\nContato encontrado:\n Nome: " + contato_buscado.getNome() + "\n Email: " + contato_buscado.getNome());
		} else {
			System.out.println("\nContato não encontrado");
		}
		
		if (agenda.remover_contato("Carol")) {
			System.out.println("\nContato removido com sucesso");
		} else {
			System.out.println("\nNão foi possível remover o contato");
		}
		
		agenda.listar_agenda();
		
		contato_buscado = agenda.buscar_contato("Carol");
		if (contato_buscado != null) {
			System.out.println("\nContato encontrado:\n Nome: " + contato_buscado.getNome() + "\n Email: " + contato_buscado.getNome());
		} else {
			System.out.println("\nContato não encontrado");
		}
	}
}

