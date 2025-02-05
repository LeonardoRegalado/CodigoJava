package pruebas;

import java.util.LinkedList;
import java.util.List;


abstract class main {
    
    public static int antiguedad;


    public static void main(String[] args) {
        String[] bancos = {"NU","BBVA","SCOTIA BANK","BANREJIO","SANTANDER"};
        String palabra = "Esta es una prueba";
        
        //palabra[0] = "Hol";
        for (char letra : palabra.toCharArray()) {
            System.out.println(letra);
        }
        System.out.println("Lista de bancos");
        for (String banco : bancos) {
            System.out.println(banco);
        }


        List<String> palabras = new LinkedList<>();
        
    }
}