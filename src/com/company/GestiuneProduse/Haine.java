package com.company.GestiuneProduse;

public class Haine extends Produs{

    private String marime;

    public Haine(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return null;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public String getName() {
        return "Haine" + super.getName();
    }
}
