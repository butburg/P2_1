package com.excercise;

public class Main {

    public static void main(String[] args) {

        float[] komponenten1 = {2, 2, 1};
        float[] komponenten2 = {2, 2, 4};


        Vektor v1 = new Vektor(3, komponenten1, false);
        Vektor v2 = new Vektor(3, komponenten2, false);
        Vektor v3 = new Vektor();

        System.out.println("1 " + v1.toString());
        System.out.println("2 " + v2.toString());
        System.out.println("transponiere...");
        v2.transponiere();
        System.out.println("2 " + v2.toString());

        System.out.println("Skalarprodukt: " + v1.skalarProdukt(v2));

        System.out.println("3 " + v3.toString());
        System.out.println("transponiere...");
        v3.transponiere();

        System.out.println("3 " + v3.toString());
        System.out.println("Skalarprodukt: " + v1.skalarProdukt(v3));
    }
}
