package model;

import java.util.List;
import java.util.Objects;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long id, String nome, String telefone, String endereco, String email, String cnpj) {
        super(id, nome, telefone, endereco, email);
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void validarDadoPessoaJuridica(List<PessoaJuridica> pessoaJuridicaList, String cnpj) {
        for (PessoaJuridica pessoaJuridica: pessoaJuridicaList) {
            if (Objects.equals(pessoaJuridica.cnpj, cnpj)) {
                System.out.println("\n" + "Olá, " + pessoaJuridica.getNome() + "!");
                System.out.println(" Qual será o pedido de hoje? ");
            }
        }
    }

    @Override
    public void imprimirPessoaJuridica(List<PessoaJuridica> pessoaJuridicaList, String cnpj) {
        for (PessoaJuridica pessoaJuridica: pessoaJuridicaList) {
            if (Objects.equals(pessoaJuridica.cnpj, cnpj)) {
                System.out.println("Id: " + pessoaJuridica.getId() + "\nNome: " + pessoaJuridica.getNome());
                System.out.println("Telefone: " + pessoaJuridica.getTelefone() + "\nEndereço: " + pessoaJuridica.getEndereco());
                System.out.println("Email: " + pessoaJuridica.getEmail() + "\nCPF: " + pessoaJuridica.getCnpj());
            }
        }
    }



}
