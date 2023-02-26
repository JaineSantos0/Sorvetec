package model;

import model.util.Cores;

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
    public void imprimirPessoaFisica(List<PessoaFisica> pessoaFisicaList, String cpf, int tipoEntrega){
        for (PessoaFisica pessoaFisica: pessoaFisicaList) {
            if (pessoaFisica.getCpf().equals(cpf) && tipoEntrega == 1) {
                System.out.println(" Dados para Entrega: \n");
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT +  " Nome: " + pessoaFisica.getNome());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Telefone: " + pessoaFisica.getTelefone() );
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Endereço: " + pessoaFisica.getEndereco());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Email: " + pessoaFisica.getEmail());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " CPF: " + pessoaFisica.getCpf());
                System.out.println(""
                        + Cores.TEXT_CYAN_BOLD_BRIGHT + "\n" + " SORVETES DELICIOSOS A CAMINHO!\n\n"
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
            } else if (pessoaFisica.getCpf().equals(cpf) && tipoEntrega == 2) {
                System.out.println(" Dados para Retirada: \n");
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT +  " Nome: " + pessoaFisica.getNome());
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + " Telefone: " + pessoaFisica.getTelefone());
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
    public void validarDadoPessoaFisica(List<PessoaFisica> pessoaFisicaList, String cpf) {
        for (PessoaFisica pessoaFisica: pessoaFisicaList) {
            if (pessoaFisica.getCpf().equals(cpf)) {
                System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + "\n" + " Olá, " + pessoaFisica.getNome() + "!");
                System.out.println(Cores.TEXT_BLUE_BOLD + " Qual será o pedido de hoje? ");
            }
        }
    }
}