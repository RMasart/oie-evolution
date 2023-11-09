package com.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Lancer le dé");
        int caseCourante = 0;
        int fin = 20;
        while (caseCourante != 20) {
            for (int numLancer = 1; numLancer <= 5; numLancer++) {
                Random generateur = new Random();
                int lancer = generateur.nextInt(6) + 1;
                fin = fin - lancer;
                caseCourante = caseCourante + lancer;
                System.out.println("Lancer " + numLancer + " : Vous êtes sur la case " + caseCourante + " (encore "
                        + fin + " cases)");
            }
            if (caseCourante == 20) {
                System.out.println("Vous avez gagner");

            } else {
                System.out.println("Vous avez perdu");
                fin = 20;
                caseCourante = 0;
            }
        }
    }
}
