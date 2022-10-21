/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_lisadiazdelvalle;

import java.util.Scanner ;
/**
 *
 * @author HTS
 */
public class Lab2P1_LisaDiazdelValle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        
        int opcion;
        do{
        System.out.println("Menu");
        System.out.println("1 -> MCD");
        System.out.println("2 -> Sumatoria");
        System.out.println("3 -> Supermercado");
        System.out.println("4 -> salida");
        System.out.println("Ingrese su opcion: ");
        opcion = leer.nextInt();
        
        //while(opcion != 4){ 
        
         if (opcion==1) {
             int a, b;
             
             System.out.println ("---MDC---");
             System.out.println ("Ingrese el primer numero: ");
             a = leer.nextInt();
             System.out.println ("Ingrese el segundo numero: ");
             b = leer.nextInt();

             if (a > 0 && b > 0) {
                System.out.print("El MDC de " +a+ " y " +b+ " es: "); 
                while (a != b){
                    if (a>b){
                        a= a  -b;
                    }
                    else {
                        b = b - a;                        
                    }//fin if/else
                    
                }
                System.out.println(" " + a);
                    
                 }//fin numeros positivos
                 else { 
                System.out.println("Los numeros ingresados deben de ser positivos");
             }
             }//fin de opcion 1
             
            else if (opcion==2){
                int k;
                System.out.println("Ingrese un numero entero positivo: ");
                k = leer.nextInt();
                if (k > 0){
                    double acumulador = 0, contador = 1, result;
                    while (contador <= k){
                        result = Math.pow (contador/(contador +1), contador);
                        acumulador += result;
                        contador++;
                    }//fin while
                    System.out.println("El resultado es: "+ acumulador);
                } //fin if k
                else {
                    System.out.println ("Debe ingresar un numero entero positivo") ;        
             }
            }  //fin opcion 2
            else if (opcion==3){
                int tipo, cantidad;
                double precio, total = 0, descuento;
                System.out.println("Ingrese el tipo de cliente: ");
                tipo = leer.nextInt();
                System.out.println("Ingrese el precio de la unidad del producto: ");
                precio = leer.nextDouble();
                System.out.println("Ingrese la cantidad del producto: ");
                cantidad = leer.nextInt();
                
                if (tipo == 0){
                    if (cantidad >= 10 && cantidad <= 19){
                    cantidad = cantidad - 2;
                    }//fin cantidad
                    else if (cantidad > 20){
                        cantidad = cantidad - 5;
                    }//Fin de cantidad
                    total = cantidad * precio;
                }// Fin tipo 0
                else if (tipo == 1){
                    if (cantidad >= 20 && cantidad <= 29){
                    cantidad = cantidad - 2;
                    } //fin cantidad
                    else if (cantidad > 30){
                    cantidad = cantidad - 5;
                    }//Fin de cantidad
                    descuento = cantidad * precio * 0.10;
                    total = cantidad * precio - descuento;   
                }//Fin tipo 1
                else if (tipo == 2){
                    if (cantidad >= 30 && cantidad <= 39){
                    cantidad = cantidad - 2;
                    }//fin cantidad
                    else if (cantidad > 40){
                        cantidad = cantidad - 5;
                    }//Fin de cantidad
                    descuento = cantidad * precio * 0.30;
                    total = cantidad * precio - descuento;
                }//fin de tipo 2
                System.out.println("El total a pagar es: " +total);           
                }
            }while(opcion!=4); //fin while menu
          
    System.out.print("Saliedo del sistema");
    }}   

