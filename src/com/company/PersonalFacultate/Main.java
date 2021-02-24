package com.company.PersonalFacultate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ionescu", "Gabriel", 27, 1);
        student.schimbaNume("Popescu");

        Profesor profesor = new Profesor("Popescu", "Ion", 30, "Engleza");

        Persoana persoana = new Persoana("Alex", "Vlad", 23);

        afisarePersoana(persoana);
        afisarePersoana(student);
        afisarePersoana(profesor);

        //Polymorfism
        // o alta forma a clasei Persoana
        Persoana[] persoane = new Persoana[5];
        persoane[0] = persoana;
        persoane[1] = profesor;
        persoane[2] = student;

        for (int i = 0; i < persoane.length; i++) {
            Persoana per = persoane[i];
            if (per != null) {
                afisarePersoana(per);
            }
        }
    }
    //Polymorfism
    public static void afisarePersoana(Persoana persoana){
        String name = persoana.getNume();
        String prenume = persoana.getPrenume();
        System.out.println(name + " " + prenume);
    }
}
