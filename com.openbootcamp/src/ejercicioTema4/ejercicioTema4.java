package ejercicioTema4;

import javax.swing.*;
import java.util.Scanner;

public class ejercicioTema4 {
    public static void main(String[]args){
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        System.out.println("por favor introducca un numero por consola");
        Scanner num=new Scanner(System.in);
        int numeroIf=num.nextInt();
        if(numeroIf<0) System.out.println("el numero es negativo");
        else if(numeroIf>0) System.out.println("el numero es positivo");
        else System.out.println("el numero es 0");
        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
        sea inferior a 3,  el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/
        System.out.println("por favor introducca un numero por consola");
        int numeroWhile=num.nextInt();
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("numeroWhile= "+numeroWhile);
        }

        //Para el bucle Do While,
        // deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do{
            int numeroDoWhile=2;
            numeroDoWhile++;
            System.out.println("numeroDoWhile= "+numeroDoWhile);
        }while(numeroWhile<3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como
        // valor 0 y su condición será que la variable sea igual o menor que 3,
        // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        int numeroFor=0;
        for(int i=0;i<=3;i++) System.out.println("numeroFor= "+numeroFor);

        num.close();
        //Por último, para el Switch, deberás crear la variable estacion,y distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.

        int estaciones= Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de una de las sig opciones:" +
                "\n1-primavera\n2-verano\n3-otoño\n4-invierno"));
        switch(estaciones){
            case 1:
                System.out.println("ha elegido primavera");
                break;
            case 2:
                System.out.println("ha elegido verano");
                break;
            case 3:
                System.out.println("ha elegido otoño");
                break;
            case 4:
                System.out.println("ha elegido invierno");
                break;
            default:
                System.out.println("ese numero no corresponde a ninguna opcion");
        }

    }
}
