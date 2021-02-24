package com.company.PersonalFacultate;

public class Student extends Persoana{
    private int anCurent;

    public Student(String name, String prenume, int varsta, int anCurent){
        super (name, prenume, varsta);
        this.anCurent = anCurent;
        System.out.println("Studentul s-a creat");
    }

    public void schimbaNume(String numeNou){
        super.setNume(numeNou);
    }

    public int getAnCurent() {
        return anCurent;
    }

    public void setAnCurent(int anCurent) {
        this.anCurent = anCurent;
    }
}
