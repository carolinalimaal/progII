package questao7;

public class Contato {
	private String nome;
	private String email;
	
	public Contato(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}
	
	public String getNome() { return this.nome;}
	
	public void setNome(String nome) { this.nome = nome;}
	
	public String getEmail() { return this.email;}
	
	public void setEmail(String email) { this.email = email;}
}
