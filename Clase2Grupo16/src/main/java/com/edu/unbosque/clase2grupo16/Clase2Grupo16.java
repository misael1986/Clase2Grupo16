/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase2grupo16;

import java.util.Scanner;//librería para poder ingresar datos desde teclado
/**
 *
 * @author Usuario
 */
public class Clase2Grupo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //--------------datos primitivos o basicos--------------------------
        int entero = 10;//definición de un entero en Java
        /*'int' o enteros son de 32 bits = 4.294.967.296/2
        en entero máximo positivo es 2.147.483.647 
         tipo    nombre asignación valor y ;  el punto y coma
        indica fin de instrucción */
        int x, y, z;//creación de 3 variables en una linea, del mismo tipo
        short corto = 31780;//entero pero más pequeño
        long enterolargo = 10;//64 bits 18.446.744.000.000.000.000
        float flotante = 10;//32 bits para la parte entera y 32 bits para punto flotante
        double doble = 10;//64 bits para la parte entera y 64 bits para punto flotante
        char caracter = '\u00D1';// solo se usa un caracter y es obligatorio la comilla sencilla
        boolean booleano = true;//true o false
        x = 10;
        y = 2;
        z = 3;

        int suma = x + y;//'+' sigue siendo el operador de suma
        int resta = x - y;//'-'
        int multiplicacion = x * y;//'*'
        int division = x / y;// '/'
        int modulo = x % y;//'%'
        float divisionFloat = (float) x / (float) y;// '/'
        int otraDivision = (int) (flotante / doble);
        //                (float) fuerza o Obliga al que el resultado sea float   
        // char -> int -> float -> double -> String
        System.out.println(suma);//'print' imprime pero no hace salto de linea
        System.out.println(resta);//'println' imprime y al final hacen salto de linea
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println(divisionFloat);
        System.out.println(otraDivision);

        //if-esle if-else de Java    
        if (x < y) {
            System.out.println(x + " es menor que " + y);//'+' puede tener 2 funciones
            //si hay String concatena todo
            //si hay datos de tipo nunerico entonces si los opera
        } else if (y < x) {
            //System.out.println("ñÑ"+y+x);
            System.out.println(caracter);
        } else {
            System.out.println("son iguales");
        }

        Scanner teclado = new Scanner(System.in);//Objeto de tipo Scanner que pérmite 
        //al usuario para que ingrese datos desde teclado
        x = teclado.nextInt();//'teclado' es nombre que se dio al objeto que me 
                              //permite captura desde teclado
        y = teclado.nextInt();
        z = teclado.nextInt();

        switch (x) {
            case 1:
                System.out.println("ud digitó un uno");
                break;
            case 2:
                System.out.println("ud digitó un dos");
                break;
            case 3:
                System.out.println("ud digitó un tres");
                break;
            case 4:
                System.out.println("ud digitó un cuatro");
                break;
            case 5:
                System.out.println("ud digitó un cinco");
                break;
            case 6:
                System.out.println("ud digitó un seis");
                break;
            case 7:
                System.out.println("ud digitó un siete");
                break;
            case 8:
                System.out.println("ud digitó un ocho");
                break;
            case 9:
                System.out.println("ud digitó un nueve");
                break;
            case 0:
                System.out.println("ud digitó un diez");
                break;
            default:
                System.out.println("ud digito otra cosa que no es un numero");
                break;
        }

        if (y > 0 && y < 10 || y > -10 && y < 0) {//and de Python es el doble ampersan &&
            System.out.println("y es una unidad");
        } else if (y >= 10 && y <= 100 || y > -100 && y <= -10) {//or en Python es doble barra 
            //|| en Java
            System.out.println("y es decenas");
        } else if (y > 100 && y < 1000 || y > -1000 && y <= -100) {
            System.out.println("y es centenas");
        } else if (y == 0) {//doble igual es para comparar
            System.out.println("y es el cero de la recta");
        } else {
            System.out.println("y es miles o mayor");
        }

        while (z != 0) {//diferente de es con !=
            System.out.println("digite nuevamente el valor de z:");
            z = teclado.nextInt();
        }
        
        
        //---------------------------------------
        
        if (!booleano==true){//not o negación es el signo de admiración
            System.out.println("este booleano es "+booleano);
        }
        else{
            System.out.println("este otro booleano es "+booleano);
        }
       
      //---------------Clases de datos Predefinidas--------------------------------------  
      
      
      Scanner entrada = new Scanner(System.in);//creando Otro objeto de tipo Scanner
      String nombre=entrada.nextLine();//String es el str de Python
      System.out.println("Nombre: "+nombre);
        System.out.println(nombre.indexOf("Fe"));//retorna la primera vez que encuentra el caracter 
                                                //dado
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.charAt(10));//retorna el char
      
    
    
    /*Paradigma OO:
        Herencia
        Polimorfismo**
        Encapsulamiento
        Abstracción (Atrubutos y Métodos)
        */
    
    Vista ventanita=new Vista(nombre);
    
    }
}
