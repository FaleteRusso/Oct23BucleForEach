import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //leer una frase y contar cuantas vocales tiene
        String frase= "";
        Scanner teclado = new Scanner(System.in);
        int contadorVocales =0;
        System.out.println("introduzca una frase");
        frase=teclado.nextLine();
        for (int i = 0; i< frase.length();i++){
            switch (frase.charAt(i)){
                case 'a','i','o','u','A','E','I','O','U':
                    contadorVocales++;
                    break;

            }
        }
        System.out.println("La frase tiene " + contadorVocales + " vocales");
    }
}
