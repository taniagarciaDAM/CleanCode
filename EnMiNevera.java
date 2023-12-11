
package enminevera;

import java.util.Scanner;

public class EnMiNevera {

    static int naranjas = 0;
    static int platanos = 0;
    static int manzanas = 0;
    static int berenjenas = 0;
    static int zanahorias = 0;
    static int calabacines = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de naranjas que hay en la nevera:");
        int naranjasIniciales = scanner.nextInt();
        naranjas += naranjasIniciales;

        System.out.println("Ingrese la cantidad de plátanos que hay en la nevera:");
        int platanosIniciales = scanner.nextInt();
        platanos += platanosIniciales;

        System.out.println("Ingrese la cantidad de manzanas que hay en la nevera:");
        int manzanasIniciales = scanner.nextInt();
        manzanas += manzanasIniciales;

        System.out.println("Ingrese la cantidad de berenjenas que hay en la nevera:");
        int berenjenasIniciales = scanner.nextInt();
        berenjenas += berenjenasIniciales;

        System.out.println("Ingrese la cantidad de zanahorias que hay en la nevera:");
        int zanahoriasIniciales = scanner.nextInt();
        zanahorias += zanahoriasIniciales;

        System.out.println("Ingrese la cantidad de calabacines que hay en la nevera:");
        int calabacinesIniciales = scanner.nextInt();
        calabacines += calabacinesIniciales;

        mostrarInventario();
      
        
        System.out.println("Ingrese la cantidad de frutas utilizadas en la Receta 1:");
        System.out.println("naranjas: ");
        int naranjasUsadas = scanner.nextInt();
        System.out.println("platanos: ");
        int platanosUsadas = scanner.nextInt();
        System.out.println("manzanas: ");
        int manzanasUsadas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de verduras utilizada en la Receta 2:");
        System.out.println("berenjenas: ");
        int berenjenasUsadas = scanner.nextInt();
        System.out.println("zanahorias: ");
        int zanahoriasUsadas = scanner.nextInt();
        System.out.println("calabacines: ");
        int calabacinesUsadas = scanner.nextInt();

        naranjas -= naranjasUsadas;
        platanos -= platanosUsadas;
        manzanas -= manzanasUsadas;

        berenjenas -= berenjenasUsadas;
        zanahorias -= zanahoriasUsadas;
        calabacines -= calabacinesUsadas;

    
        int frutasDespues = naranjas + platanos + manzanas;
        int verdurasDespues = berenjenas + zanahorias + calabacines;

        System.out.println("Cantidad de frutas que quedan en la nevera: " + frutasDespues);
        System.out.println("Cantidad de verduras que quedan en la nevera: " + verdurasDespues);
        

        if (frutasDespues <= 2) {
            System.out.println("¡Atención! Quedan 2 o menos frutas en la nevera. ¡Compra más!");
        }
        if (verdurasDespues <= 2){
            System.out.println("¡Atención! Quedan 2 o menos verduras en la nevera. ¡Compra más!");
        }
        
       
        comprar(scanner);
        mostrarInventario();
    }

    
    static void comprar(Scanner scanner) {
        agregarProducto(scanner, "naranjas");
        agregarProducto(scanner, "platanos");
        agregarProducto(scanner, "manzanas");
        agregarProducto(scanner, "berenjenas");
        agregarProducto(scanner, "zanahorias");
        agregarProducto(scanner, "calabacines");
        System.out.println("¡Compra realizada con éxito! Frutas y verduras añadidas al inventario.");
    }
     
    static void agregarProducto(Scanner scanner, String producto) {
        System.out.println("Ingrese la cantidad de " + producto + " que ha comprado:");
        int cantidadComprada = scanner.nextInt();
        switch (producto) {
            case "naranjas" -> naranjas += cantidadComprada;
            case "platanos" -> platanos += cantidadComprada;
            case "manzanas" -> manzanas += cantidadComprada;
            case "berenjenas" -> berenjenas += cantidadComprada;
            case "zanahorias" -> zanahorias += cantidadComprada;
            case "calabacines" -> calabacines += cantidadComprada;
  
        }
    }   
    
    static void mostrarInventario() {
        System.out.println("Inventario en la nevera:");
        System.out.println("Naranjas: " + naranjas);
        System.out.println("Plátanos: " + platanos);
        System.out.println("Manzanas: " + manzanas);
        System.out.println("Berenjenas: " + berenjenas);
        System.out.println("Zanahorias: " + zanahorias);
        System.out.println("Calabacines: " + calabacines);
    }
}

        
        
   

