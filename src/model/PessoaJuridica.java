package model;

import model.util.Cores;

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
    public void imprimirPessoaJuridica(List<PessoaJuridica> pessoaJuridicaList, String cnpj, int tipoEntrega) {
        for (PessoaJuridica pessoaJuridica: pessoaJuridicaList) {
            if (pessoaJuridica.getCnpj().equals(cnpj) && tipoEntrega == 1) {
                System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + " Dados para Entrega: \n");
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Nome: " + pessoaJuridica.getNome());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Telefone: " + pessoaJuridica.getTelefone());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Endereço: " + pessoaJuridica.getEndereco());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Email: " + pessoaJuridica.getEmail());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " CNPJ: " + pessoaJuridica.getCnpj());
                System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "\n" + " SORVETES DELICIOSOS A CAMINHO!\n\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "               ___\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "             /  _\\\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "             | /\\_|\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "          __-'' _'\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "         ----'-.\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "            |#\\#)_,_\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "            )##\\__ _\\__.-. \r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "    -  .-  (###)   '---.  `.\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + " -   __\\____`.#\\(      )  L(|\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "   .'__//\\    \\#)`-._.' / \\\\==.\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "  /_/_//\\_\\_  /#/  ### / //\\\\ \\\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "   |(________(##)___/-' '| (_) |\r\n"
                        + Cores.TEXT_PURPLE_BOLD_BRIGHT + "____\\___/_________________\\___/____________________________________________________________________");
                System.out.println("\n" + " Copyright ©️ 2023 - SORVETEC");
            } else if (pessoaJuridica.getCnpj().equals(cnpj) && tipoEntrega == 2) {
                System.out.println(Cores.TEXT_BLUE_BOLD_BRIGHT + " Dados para Retirada: \n");
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Nome: " + pessoaJuridica.getNome());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Telefone: " + pessoaJuridica.getTelefone());
                System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "\n" + " SEU PEDIDO ESTÁ SENDO PREPARADO!\n\n");
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +
                        "             ⢀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \n" +
                        "⠀⠀⢀⣀⣀⣀⣀⣀⣀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣀⣀⣀⣀⣀⣀⡀⠀⠀\n" +
                        "⠀⠀⢠⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⡄⠀⠀\n" +
                        "⠀⠀⣿⣿⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿⠀⠀\n" +
                        "⠀⠀⣿⣿⣿⣿⡟⢸⣿⣿⣿⣿⢹⣿⣿⣿⣿⡘⣿⣿⣿⣿⡇⢻⣿⣿⣿⣿⠀⠀\n" +
                        "⠀⢀⣛⣛⣛⣛⠃⣛⣛⣛⣛⡋⠈⣛⣛⣛⣛⠁⢛⣛⣛⣛⣛⠘⣛⣛⣛⣛⡀⠀\n" +
                        "⠀⠈⠻⠿⠿⠋⣀⠈⠻⠿⠟⢁⡀⠙⠿⠿⠋⢀⡈⠻⠿⠟⠁⣀⠙⠿⠿⠟⠁⠀\n" +
                        "⠀⢸⣷⣦⣶⣿⣿⣿⣶⣤⣶⣿⣿⣷⣦⣴⣾⣿⣿⣶⣤⣶⣿⣿⣿⣶⣴⣾⡇⠀\n" +
                        "⠀⢸⣿⡏⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⡉⢹⣿⠉⣉⣉⣉⣉⣉⢹⣿⡇⠀\n" +
                        "⠀⢸⣿⡇⣿⠉⢉⣩⣭⣽⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⣿⣿⣿⣿⣿⢸⣿⡇⠀\n" +
                        "⠀⢸⣿⡇⣿⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⠿⠿⠿⠿⠿⢸⣿⡇⠀\n" +
                        "⠀⢸⣿⡇⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⠶⠶⠶⠶⠶⢸⣿⡇⠀\n" +
                        "⠀⢸⣿⡇⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢸⣿⠀⣶⣶⣶⣶⣶⢸⣿⡇⠀\n" +
                        "⠀⢸⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⠀⣿⣿⣿⣿⣿⢸⣿⡇⠀\n" +
                        "⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠉⠉⠉⠉⠉⠈⠉⠁  ");
                System.out.println("\n" + " Copyright ©️ 2023 - SORVETEC");
            }
        }
    }

    @Override
    public void validarDadoPessoaJuridica(List<PessoaJuridica> pessoaJuridicaList, String cnpj) {
        for (PessoaJuridica pessoaJuridica: pessoaJuridicaList) {
            if (Objects.equals(pessoaJuridica.cnpj, cnpj)) {
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + "\n" + " Olá, " + pessoaJuridica.getNome() + "!");
                System.out.println(Cores.TEXT_BLUE_BOLD + " Qual será o pedido de hoje? ");
            }
        }
    }
}
