package com.company.Basic;

public class Bloc {
    public String scara;
    private String numeBloc;
    private int numarEtaje;
    private int pretPeEtaj;

  public   Bloc(int numEtaj,String scara){
        this.numarEtaje = numEtaj;
        this.scara = scara;
    }

   public Bloc(int numEtaj,String scara, String numeBloc){
        this.scara = scara;
        this.numarEtaje = numEtaj;
        this.numeBloc = numeBloc;
    }
public String getAdresa(){
    String adresa = this.numeBloc + " " + this.scara;
    return adresa;
}
public void setScara(String scara){
      this.scara = scara;
}
public void setNumeBloc(String numeBloc){
      this.numeBloc = numeBloc;
}

    public int getNumarEtaje() {
        return numarEtaje;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumarEtaje(int numarEtaje) {
        this.numarEtaje = numarEtaje;
    }

    public void setPretPeEtaj(int pret){
      this.pretPeEtaj = pret;
    }
    public int getPretPeEtaj(){
      return this.pretPeEtaj;
    }

    public int calculateTotalPrice(){
      int total = this.numarEtaje * this.pretPeEtaj;
      return total;
    }
}
