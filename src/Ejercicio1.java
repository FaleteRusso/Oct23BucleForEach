import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear un bloque de codigoque pinte las vocales
        //y solo las vocales que existen en un array de caracteres.
        //EL programa debe de ir comprobando, con un bucle,
        // para determinar si cada carácter del array es o no una vocal

        char [] letras ={'a','b','d','e','g'};

        for(int i =0; i < letras.length; i++){
            System.out.println("Escriba una vocal ->");
            switch (letras[i]){
                case 'a','e','i','o','u','A','E','I','O','U':
                    System.out.println(letras[i]+ "  Es una vocal " + " y está en la posición " +i);
                    break;
                default:
                    System.out.println(letras[i] + "  La letra introducida no es valida (No vocal)");
            }
        }


    }
}
