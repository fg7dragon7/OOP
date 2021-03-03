package com.company.GestiuneProduse;

public class Fruct extends Produs{

    private boolean bio;

    public Fruct(String name, double pret, String producator) {
        super(name, pret, producator);
    }

    @Override
    public String getCategory() {
        return null;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}
