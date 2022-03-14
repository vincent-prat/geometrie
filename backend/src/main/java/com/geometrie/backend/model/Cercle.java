package com.geometrie.backend.model;

public class Cercle implements FigureGeometriqueInterface {
    private double rayon;

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double CalculPerimetre() {
        return 2*Math.PI*this.rayon;
    }

    @Override
    public double CalculSurface() {
        return Math.PI*Math.sqrt(this.rayon);
    }
}
