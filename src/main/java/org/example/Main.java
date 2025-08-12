package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Interactuemos con el usuario
        Scanner LeerTeclado = new Scanner(System.in);

        System.out.println("sumaremos dos numeros");
        System.out.println("☆*: .｡. o(≧▽≦)o .｡.:*☆");

        try {
            System.out.print("Digita el primer numero entero: ");
            Integer numeroUno = LeerTeclado.nextInt();
            System.out.print("Digita el segundo numero entero: ");
            Integer numeroDos = LeerTeclado.nextInt();


            //Llamando a la funcion que suma los dos numeros
            Integer resultado = sumarDosNumeros(numeroUno, numeroDos);
            System.out.println("el resultado de la suma es: " + resultado);

            Integer resultadoresta = restarDosNumero(numeroUno, numeroDos);
            System.out.println("el resultado de la resta es: " + resultadoresta);

        } finally {
            System.out.println("gracias, hasta pronto 😁");
            LeerTeclado.close();
        }

    }
    public static Integer sumarDosNumeros(Integer numeroUno, Integer numeroDos) {


        return numeroUno + numeroDos;
    }
    public  static  Integer restarDosNumero(Integer numeroUno, Integer numeroDos) {

        return  numeroUno - numeroDos;

    }

    public static Integer multiplicarDosNumeros (Integer numeroUno, Integer numeroDos) {

    }
    public static Integer dividirDosNumeros (Integer numeroUno, Integer numeroDos) {

    }

}