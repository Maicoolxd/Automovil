package org.maicol;

import java.util.Scanner;

/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 09/05/2024
 * Detalle:Ingresamos los valores por teclado para eso utilizamos un Scanner
 * Llamamos a nuestra clase Automovil y a los datos ingresados
 * Usasmos un while para las opciones de acelerar, desacelerar y frenar
 * En cada case imprime cada metodo correspondiente a la opcion, el metodo imprimir y el metodo Calcular
 * Version:1.1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ingreso de datos para el automovil por teclado
        System.out.print("Ingrese la marca del automovil:");
        String marca1 = sc.next();
        System.out.print("Ingrese el modelo del automovil (año):");
        int modelo1 = sc.nextInt();
        System.out.print("Ingrese el volumen del motor del automovil:");
        double motor1 = sc.nextDouble();
        System.out.print("Ingrese el tipo de combustible del automovil:");
        String tipo_combustible1 = sc.next();
        System.out.print("Ingrese el tipo de automovil:");
        String tipo_automovil1 = sc.next();
        System.out.print("Ingrese el numero de puertas del automovil:");
        int numero_puertas1 = sc.nextInt();
        System.out.print("Ingrese la cantidad de asientos del automovil:");
        int asientos1 = sc.nextInt();
        System.out.print("Ingrese la velocidad maxima del automovil:");
        int velocidad_max1 = sc.nextInt();
        System.out.print("Ingrese el color del automovil:");
        String colo1 = sc.next();
        System.out.print("Ingrese la velocidad actual del automovil:");
        int velocidad_actual1 = sc.nextInt();
        System.out.print("Ingrese la distancia de su recorrido:");
        int distancia1 = sc.nextInt();
        System.out.println("--------------------------------------");

        Automovil automovil = new Automovil(marca1,modelo1,motor1,tipo_combustible1,tipo_automovil1,
                numero_puertas1,asientos1,velocidad_max1,colo1,velocidad_actual1,distancia1);

        //Utilizamos el while para un bucle repetitivo indefinidamente
        String op;
        boolean salir = false;
        while(!salir) {
            System.out.println("--------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Acelerar");
            System.out.println("2. Desacelerar");
            System.out.println("3. Frenar");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------");
            //Cada caso muestra los metodos utilizados en la clase Automovil
            op = sc.next();
            switch (op) {
                case "1":
                    System.out.println("--------------------------------------");
                    System.out.print("Ingrese la velocidad de aumento en km/h: ");
                    int aumento = sc.nextInt();
                    automovil.Acelerar(aumento);
                    automovil.Imprimir();
                    System.out.println("El tiempo de llegada es de:" + automovil.Calcular() + " horas");
                    System.out.println("--------------------------------------");
                    break;
                case "2":
                    System.out.println("--------------------------------------");
                    System.out.print("Ingrese la velocidad de reducción en km/h: ");
                    int reduccion = sc.nextInt();
                    automovil.Decrementar(reduccion);
                    automovil.Imprimir();
                    System.out.println("El tiempo de llegada es de:" + automovil.Calcular()+ " horas");
                    System.out.println("--------------------------------------");
                    break;
                case "3":
                    System.out.println("--------------------------------------");
                    automovil.Frenar();
                    automovil.Imprimir();
                    System.out.println("--------------------------------------");
                    break;
                case "4":
                    System.out.println("--------------------------------------");
                    System.out.println("Finalizando....");
                    automovil.Imprimir();
                    salir=true;
                    System.out.println("--------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

            }
        }

    }
}
