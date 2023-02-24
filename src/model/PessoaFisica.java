package model;

import java.util.List;

public class PessoaFisica extends Cliente{

    private String cpf;

    public PessoaFisica(){

    }

    public PessoaFisica(Long id, String nome, String telefone, String endereco, String email, String cpf) {
        super(id, nome, telefone, endereco, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void imprimirPessoaFisica(List<PessoaFisica> pessoaFisicaList, String cpf){
        for (PessoaFisica pessoaFisica: pessoaFisicaList) {
            if (pessoaFisica.getCpf().equals(cpf)) {
                System.out.println("Id: " + pessoaFisica.getId() + "\nNome: " + pessoaFisica.getNome());
                System.out.println("Telefone: " + pessoaFisica.getTelefone() + "\nEndereço: " + pessoaFisica.getEndereco());
                System.out.println("Email: " + pessoaFisica.getEmail() + "\nCPF: " + pessoaFisica.getCpf());
            }
        }
    }

    @Override
    public void validarDadoPessoaFisica(List<PessoaFisica> pessoaFisicaList, String cpf) {
        for (PessoaFisica pessoaFisica: pessoaFisicaList) {
            if (pessoaFisica.getCpf().equals(cpf)) {
                System.out.println(pessoaFisica.getNome());
            }
        }
    }
}