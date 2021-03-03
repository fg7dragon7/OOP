package com.company.Colectie;

import java.util.ArrayList;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayList<Product> lista = new ArrayList<>();

        Product product = new Product();
        product.setName("Mere");
        lista.add(product);

        Product pere = new Product();
        product.setName("Pere");
        lista.add(product);

        Product ananas = new Product();
        product.setName("Ananas");
        lista.add(product);

        lista.remove(pere);

        for (int i = 0; i < lista.size(); i++){
            Product prodDinLista = lista.get(i);
            System.out.println(prodDinLista.getName());
        }


    }
}
