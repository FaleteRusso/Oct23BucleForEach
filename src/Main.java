import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definimos el Array de char
        char [] letras = new char [5];
        //Definir el scanner para leerlo desde consola
        //Con esto guardamos los datos en el array desde la consola
        Scanner teclado = new Scanner(System.in);
        for(int i =0; i < letras.length; i++){
            System.out.println("Escriba una letra ->");
            letras[i]=teclado.next().charAt(0);
        }
        //Mostrar los datos almacenados en el array
        for (int i=0;i< letras.length;i++){
            System.out.println(letras[i]);
        }
    }
}