/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurasbasicascontrol;

/**
 *
 * @author 
 */
import java.util.Scanner;

public class EstructurasBasicasControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Control secuencial:");
        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        
        
        System.out.println("Control selectivo:");
        System.out.print("Ingrese un número: ");
        int num3 = sc.nextInt();
        if (num3 > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (num3 < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }
        
        
        System.out.println("Control repetitivo:");
        System.out.print("Ingrese un número: ");
        int num4 = sc.nextInt();
        int factorial = 1;
        for (int i = num4; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num4 + " es: " + factorial);
        
        sc.close();
    }
}
