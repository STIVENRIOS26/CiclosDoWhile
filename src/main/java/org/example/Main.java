package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Integer contadorBueno=0;
        Integer contadorMalos=0;
        String contraseña;
        Integer numeroContraseñas;
        Integer contadorIntentos=0;

        System.out.print("Digita el numero de contraseñas que vas a ingresar: ");
        numeroContraseñas=teclado.nextInt();

        do {
            contadorIntentos=contadorIntentos+1;
            System.out.print("Digita la contraseña: ");
            contraseña=teclado.next();
            Integer contadorLetras=contraseña.length();

            if (contadorLetras>=8){
                contadorBueno=contadorBueno+1;
            }else{
                contadorMalos=contadorMalos+1;
            }

        }while(contadorIntentos<numeroContraseñas);

        System.out.println("El numero de contraseñas buenas fue: "+contadorBueno);
        System.out.println("El numero de contraseñas malas fue: "+contadorMalos);
    }
}