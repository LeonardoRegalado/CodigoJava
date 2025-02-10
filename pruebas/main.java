package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


abstract class main {
    
    public static int antiguedad;


    public static void main(String[] args) {                                        
    String[] bancos = {"NU","BBVA","SCOTIA BANK","BANREJIO","SANTANDER"};
    String palabra = "Esta es una prueba";
    char letra = 'a';
    //palabra[0] = "Hol";
    /*
        System.out.println("Longitud de un arreglo "+bancos.length);
    System.out.println("Longitud de una poalabra "+palabra.length());
    for (char letra : palabra.toCharArray()) {
        System.out.println(letra);
    }
    System.out.println("Lista de bancos");
    for (String banco : bancos) {
        System.out.println(banco);
    }
        */
    String[] copia = bancos.clone();
    //bancos[0] = "BANCOMER";
    //System.out.println(copia[0]); NU
    //System.out.println(bancos[0]); BANCOMER
    //System.out.println(Arrays.equals(bancos, copia)); // Devuelve true
    System.out.println();

    List<String> palabras = new LinkedList<>();
    

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    ArrayList cars2 = (ArrayList)cars.clone();
    cars.set(0, "Toyota");
    System.out.println("---------------------------");
    System.out.println(cars.size());
    System.out.println(cars2);
        
    ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(25);
        numeros.add(4);
        numeros.add(233);
        numeros.add(11);
    numeros.forEach((numero)-> {
        System.out.println(numero + 1);
    });

    ArrayList<String> carros = new ArrayList<String>();
    carros.add("Volvo");
    carros.add("BMW");
    carros.add("Ford");
    carros.add("Mazda");

    Collections.sort(carros);  // Sort cars
    System.out.println("A partir de aqui estaremos en la sigueinte version");
    for (String carro : carros) {
        System.out.println(carro);
    }
    for (int i = 0; i < copia.length; i++) {
        
    }
    //La siguiente sera la preuba de una HashMapo
    }
}