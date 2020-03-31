package com.excercise;

public class Vektor {
    private int dimension;
    private float[] komponenten;
    private boolean istZeilenvektor = true;

    public Vektor() {
        this.dimension = 0;
        this.komponenten = new float[]{0};
    }

    public Vektor(int dimension, float[] komponenten, boolean istZeilenvektor) {
        // Check, ob dimension der Anzahl übergebener Komponentnen entspricht
        if (dimension == komponenten.length) {
            this.dimension = dimension;
            this.komponenten = komponenten;
            this.istZeilenvektor = istZeilenvektor;
        } else if (dimension > komponenten.length) {
            vektorNullenErgaenzen(dimension, komponenten);
        } else {
            System.out.println("Die Dimension passt nicht zu den gegebenen Komponenten.");
            this.dimension = 0;
            this.komponenten = new float[]{0};
        }

    }

    private void vektorNullenErgaenzen(int dimension, float[] komponenten) {
        float[] temp = new float[dimension];
        for (int i=0; i < komponenten.length; i++) {
            temp[i] = komponenten[i];
        }
        System.out.println(temp.toString());
        this.komponenten = temp;
    }

    public String toString() {
        String output = "Vektor: ";
        if (istZeilenvektor) {
            for (float i : komponenten) {
                output += "[" + i + "] ";
            }
        } else {
            for (float i : komponenten) {
                output += "\n[" + i + "]";
            }
        }
        return output;
    }

    public void transponiere() {
        if (istZeilenvektor) {
            istZeilenvektor = false;
        } else
            istZeilenvektor = true;
    }

    public float skalarProdukt(Vektor b) {
        if (dimension == b.dimension) {
            float sum = 0;

            for (int i = 0; dimension > i; i++) {
                sum += komponenten[i] * b.komponenten[i];
            }
            return sum;
        } else {
            System.out.println("Die Vektoren sind unterschiedlich dimensioniert! ");
            return 0;
        }
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public float[] getKomponenten() {
        return komponenten;
    }

    public void setKomponenten(float[] komponenten) {
        this.komponenten = komponenten;
    }

    public boolean isIstZeilenvektor() {
        return istZeilenvektor;
    }

    public void setIstZeilenvektor(boolean istZeilenvektor) {
        this.istZeilenvektor = istZeilenvektor;
    }
}