package entities;

import java.util.List;

public class Cliente{ 
	
	private Float id;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
	
	public Cliente(Float id, String nome, String telefone, String endereco, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

	public Float getId() {
		return id;
	}

	public void setId(Float id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimirDadosCliente() {
				System.out.println("Nome: " + nome);
				System.out.println("Telefone: " + telefone);
			}
	
}