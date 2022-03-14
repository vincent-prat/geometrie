package com.geometrie.backend.model;

public class Rectangle extends Quadrilatere implements FigureGeometriqueInterface{
    private double coteA;
    private double coteB;

    public Rectangle() {
    }

    public Rectangle(double coteA, double coteB) {
        this.coteA = coteA;
        this.coteB = coteB;
    }

    public double getCoteA() {
        return coteA;
    }

    public void setCoteA(double coteA) {
        this.coteA = coteA;
    }

    @Override
    public double CalculPerimetre() {
        return 2*(coteA+coteB);
    }

    @Override
    public double CalculSurface() {
        return coteA*coteB;
    }
}
