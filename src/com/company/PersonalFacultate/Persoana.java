package com.company.PersonalFacultate;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String name, String prenume, int varsta) {
        this.nume = name;
        this.prenume = prenume;
        this.varsta = varsta;
        System.out.println("Persoana s-a creat");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
