package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int num = 1;
        while(num>0 && num<13) {
            System.out.print("Ingrese un numero entero menor que 13 para generar una tabla de multiplicacion: ");
            num = n.nextInt();
            System.out.println(" ");
            if (num < 13) {
                for (int i = 0; i < 13; i++) {
                    int result = num * i;
                    System.out.println(num + " x " + i + " = " + result);
                }
                System.out.println(" ");
            }
            else{
                System.out.println("Lo siento, ese numero no esta dentro del rango permitido");
            }
        }
    }
}