import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Crear un bloque de código que lea las componentes de un array de enteros
        //y me pinte cuales son pares, cuales impares y cuales multiplos de 3
        //para este ejercicio utilizar un bucle quw recorra el array y utilizar el operador %
        int[] numeros = new int[5];
        Scanner tecladoNumerico = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escriba sus numeros");
            numeros[i] = tecladoNumerico.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El numero es par -> " + numeros[i]);
            } else {
                System.out.println("El numero " + numeros[i] + " es impar");
            }

            if (numeros[i] % 3 == 0) {
                System.out.println("El numero " + numeros[i] + " es multiplo de 3");
            }else{
                System.out.println("el numero " + numeros[i] + " no es multiplo de 3");
            }
        }
    }
}
