/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cribaeratostenes;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class CribaEratostenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase clas = new Clase();
        Scanner s = new Scanner(System.in);
        System.err.print("Escribe el número máximo para la búsqueda de números primos: ");
        int max = s.nextInt();
        int arrayCaracteres[];
        arrayCaracteres = new int[1000];

        for (int i = 0; i < 1000; i++) {

            arrayCaracteres[i] = i + 2;
            if (clas.esPrimo(arrayCaracteres[i])) {
                arrayCaracteres[i] = 0;
            }

        }
        int salto = 45;
        for (int i = 0; i < 1000; i++) {
            if (arrayCaracteres[i] == salto) {
                System.out.println("");
                salto = salto + 45;
            }
            System.out.print("[" + arrayCaracteres[i] + "]");

        }

    }

}
