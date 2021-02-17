package com.company.Basic;

import com.company.Basic.Bloc;

import java.util.Scanner;

public class Main00 {

    public static void main(String[] args) {
	// write your code here
        Bloc blocA1 = new Bloc(12, "Scara 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care e numele blocului?");
        String numeBloc = scanner.nextLine();//E2
        blocA1.setNumeBloc(numeBloc);
        String adresa = blocA1.getAdresa();
        System.out.println();

        System.out.println("Introduce-ti pretul");
        int pret = scanner.nextInt();
        scanner.nextLine();
        blocA1.setPretPeEtaj(pret);

        int total = blocA1.calculateTotalPrice();
        System.out.println("Te costa: " + total);
    }

}
