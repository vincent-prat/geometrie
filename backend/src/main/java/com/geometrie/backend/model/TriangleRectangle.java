package com.geometrie.backend.model;

public class TriangleRectangle implements FigureGeometriqueInterface {

    private double hypothenuse;
    private double coteA;
    private double coteB;

    public TriangleRectangle() {
    }

    public TriangleRectangle(double hypothenuse, double coteA, double coteB) {
        this.hypothenuse = hypothenuse;
        this.coteA = coteA;
        this.coteB = coteB;
    }

    public double getHypothenuse() {
        return hypothenuse;
    }

    public void setHypothenuse(double hypothenuse) {
        this.hypothenuse = hypothenuse;
    }

    public double getCoteA() {
        return coteA;
    }

    public void setCoteA(double coteA) {
        this.coteA = coteA;
    }

    public double getCoteB() {
        return coteB;
    }

    public void setCoteB(double coteB) {
        this.coteB = coteB;
    }

    @Override
    public double CalculPerimetre() {
        return hypothenuse+coteA+coteB;
    }

    @Override
    public double CalculSurface() {
        return (coteA*coteB)/2;
    }

}
