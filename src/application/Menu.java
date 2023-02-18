package application;

import entities.Produto;

import java.util.Locale;

public class Menu {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto prod1 = new Produto("Sorvete","Pote 2l","Morango","sem cobertura","sem adicional",17.00);

        System.out.println(prod1);
    }
}
