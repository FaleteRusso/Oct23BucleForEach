public class Ejercicio3 {
    public static void main(String[] args) {
        //crear un bucle que pinte en la consola todas
        // las variables de un array en orden inverso a como están guardadas

        //1. Definir el array con los datos 5,4,7,9,8
        //2, en un bucle recorrerlo (cambair valor inicial, condición, modificación de i)

        int []num={5,4,7,9,8};
        System.out.println("Valores en orden inverso");
        for (int i = num.length -1;i>=0;i--){
            //for (int i = 4;i>=0;i--){
            System.out.println(num[i]);
        }
    }
}
