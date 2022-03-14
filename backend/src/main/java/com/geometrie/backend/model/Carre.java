package com.geometrie.backend.model;

public class Carre extends Quadrilatere implements FigureGeometriqueInterface {
    private double cote;

    public Carre() {
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double CalculPerimetre() {
        return 4*cote;
    }

    @Override
    public double CalculSurface() {
        return cote*cote;
    }
}
