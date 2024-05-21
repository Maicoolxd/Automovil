package org.maicol;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 09/05/2024
 * Detalle: La clase Automovil permite el ingreso de datos por teclado
 *El metodo Calcular permite medir el tiempo que tomara en llegar al destino
 *El metodo Acelerar permite calcular la velocidad que aumenta
 *El metodo Decrementar permite calcular la velodicad cuando disminuye
 *El metodo Frenar permite calcular cuandoe l automovil se queda sin movimiento
 *El metodo impirmir muestra los datos finales ingresados por teclado
 * Version:1.1.0
 */

public class Automovil {

    //Declaracion de Variables
    String marca;
    int modelo;
    double motor;
    String tipo_combustible;
    String tipo_automovil;
    int numero_puertas;
    int cantidad_asientos;
    int velocidad_max;
    String color;
    int velocidad_actual=0;
    double distancia;

    //Constructor
    Automovil(String marca, int modelo, double motor, String tipo_combustible,
              String tipo_automovil, int numero_puertas, int cantidad_asientos,
              int velocidad_max, String color, int velocidad_actual, double distancia){
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
        this.tipo_combustible=tipo_combustible;
        this.tipo_automovil=tipo_automovil;
        this.numero_puertas=numero_puertas;
        this.cantidad_asientos=cantidad_asientos;
        this.velocidad_max=velocidad_max;
        this.color=color;
        this.velocidad_actual=velocidad_actual;
        this.distancia=distancia;
    }

    //Metodos get y set
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public int getModelo(){
        return modelo;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public double getMotor(){
        return motor;
    }
    public void setMotor(double motor){
        this.motor=motor;
    }
    public String getTipo_combustible(){
        return tipo_combustible;
    }
    public void setTipo_combustible(String tipo_combustible){
        this.tipo_combustible=tipo_combustible;
    }
    public String getTipo_automovil(){
        return tipo_automovil;
    }
    public void setTipo_automovil(String tipo_automovil){
        this.tipo_automovil=tipo_automovil;
    }
    public int getNumero_puertas(){
        return numero_puertas;
    }
    public void setNumero_puertas(int numero_puertas){
        this.numero_puertas=numero_puertas;
    }
    public int getCantidad_asientos(){
        return cantidad_asientos;
    }
    public void setCantidad_asientos(int cantidad_asientos ){
        this.cantidad_asientos=cantidad_asientos;
    }
    public int getVelocidad_max (){
        return velocidad_max;
    }
    public void setVelocidad_max(int velocidad_max){
        this.velocidad_max=velocidad_max;
    }
    public String getColor(){
        return marca;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getVelocidad_actual(){
        return velocidad_actual;
    }
    public void setVelocidad_actual(int velocidad_actual){
        this.velocidad_actual=velocidad_actual;
    }

    //Este metodo se usa para calcular el tiempo de llegada mediante el calculo
    //del cociente que es d/v_a
    public double Calcular(){
        return distancia/velocidad_actual;
    }

    //Este metodo se usa para acelerar el automovil
    public void Acelerar(int aumento){
        if (velocidad_actual+aumento>velocidad_max){
            System.out.println("No puede acelerar mas alla de la velocidad maxima");
        }
        else
        {
            velocidad_actual=velocidad_actual+aumento;
        }
    }

    //Este metodo se usa para desacelerar el automovil
    public void Decrementar(int decremento){
        if (velocidad_actual - decremento < 0){
            System.out.println("No puede desacelerar a un velocidad negativa");
        }
        else
        {
            velocidad_actual=velocidad_actual - decremento;
        }
    }
    //Este metodo se usa para frenar el automovil
    public void Frenar(){
        velocidad_actual=0;
    }

    //Este metodo se usa para imprimir los datos ingresados en el main
    public void Imprimir(){
        System.out.println("La marca del automovil es:" +marca);
        System.out.println("El año del modelo del automovil es:" +modelo);
        System.out.println("El volumen del motor del automovil es:" +motor +" litros");
        System.out.println("El tipo de combustible del automovil es:"+tipo_combustible);
        System.out.println("El numero del puertas del automovil es:"+numero_puertas);
        System.out.println("La cantidad de asientos del automovil es:"+cantidad_asientos);
        System.out.println("La velocidad maxima del automovil es: "+velocidad_max + " km/h");
        System.out.println("El colo del automovil es:"+color);
        System.out.println("La velocidad actual del automovil es:"+velocidad_actual + " km/h");
    }
}
