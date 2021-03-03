package com.company.AbstractX;

public class Patrat extends FormaGeometrica{

    private double lun;

    @Override
    public double calculateArea(){
        return lun * lun;
    }

    @Override
    public double calculatePerimeter(){
        return lun*4;
    }

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }
}
