package entities;

import java.util.List;

public class Cliente{ 
	
	private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String nome, String telefone, String endereco, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public void imprimirDadosCliente(List<Cliente> clienteList, String telefone) {
        for (Cliente cliente: clienteList) {
            if (cliente.getTelefone().equalsIgnoreCase(telefone)) {
                System.out.println(cliente.nome + " " + cliente.telefone);
            }
         }
     }
}