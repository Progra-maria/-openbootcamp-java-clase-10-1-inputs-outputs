package com.company;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) throws FileNotFoundException {
        //la clase Scanner se utiliza para recopilar datos que introduce un usuario
        //el método "in" es en sí mismo un InputStream (public static final ImputStream = null)

        // File doc =
        //   new File("/etc/passwd");
        // Scanner obj = new Scanner(doc);

        // while (obj.hasNextLine())
        //     System.out.println(obj.nextLine());
        
        
        try{
            //leer el fichero
            InputStream fichero = new FileInputStream("/etc/passwd.text");
            //guardar el contenido del fichero
                try {
                      Scanner scan = new Scanner(fichero);
                         while (scan.hasNextLine());
            //imprimir el contenido del fichero en pantalla
                      System.out.println(scan.nextLine());
                     }
            //tratar excepción
                    catch (Exception e){
                     System.out.println("Ha fallado algo en el scanner");
                    }
            //tratar excepción
        } catch (FileNotFoundException e) {
            System.out.println("Hubo un error" + e.getLocalizedMessage());
        }
        System.out.println("fin del programa");
        // try { 

        // //     No funciona el InputStream
        //     InputStream fichero = new FileInputStream("../../../README.md");
        //     try {
        //         Scanner scanner = new Scanner(fichero);
        //         while (scanner.hasNextLine());
        //         System.out.println(scanner.nextLine());
        //     }
        //     catch (Exception e){
        //         System.out.println("Ha fallado algo en el scanner");
        //     }
            
        // }  catch (IOException e) {
        //     System.out.println("No puedo leer el fichero" + e.getMessage());
        // }
        // System.out.println("fin del programa");

        //Scan para datos que entran por el teclado
    }
}
