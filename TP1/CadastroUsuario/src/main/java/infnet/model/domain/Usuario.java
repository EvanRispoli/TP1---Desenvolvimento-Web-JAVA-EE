package infnet.model.domain;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	
	
	
	
	public Usuario(String nome, String email, String senha) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("O usuario [%s] foi cadastrado com sucesso com o e-mail [%s] e senha[%s]", nome, email, senha);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
