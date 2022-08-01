package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Un programa de ordenador es un sistema de entrada de datos, procesamiento de los mismos y salida del resultado
 * La entrada puede venir del teclado, del ratón, de un fichero, de un servidor...
 * Ej: cuando escuchamos un mp3, el sistema lee el fichero y lo convierte en audio
 */
public class InputStreams {
    public static void main(String[] args) {

        //LEER FICHEROS CON READALLBYTES
        System.out.println("*******LEER CON READALLBYTES*******");
        try{
            //leer el fichero
            InputStream fichero = new FileInputStream("/etc/passwd");
            //guardar el contenido del fichero
            try {
                //Nos devuelve una array de bytes
                byte [] datos = fichero.readAllBytes();
                //for que recorre el fichero byte a byte y lo imprime en pantalla
                for(byte dato : datos){
                    //imprime cada caracter en forma de número
                    //System.out.println(dato);
                    //convierte cada numero en su caracter correspondiente
                    System.out.print((char)dato);
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero" + e.getMessage());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Hubo un error" + e.getLocalizedMessage());
        }
                System.out.println("*******LEER CON READ*******");
                //LEER FICHEROS CON READ
                try{
                    //leer el fichero
                    InputStream fichero2 = new FileInputStream("/etc/passwd");
                    //guardar el contenido del fichero
                    try {
                        // nos devuelve números
                        int dato = fichero2.read();
                        //while que lee la variable datos uno a uno hasta que se acaban los datos (EOF = "End Of File")
                        while (dato != -1){
                        //imprimimos el dato
                        System.out.print((char)dato);
                        //actualizamos la variable dato en cada interacción del bucle
                        dato = fichero2.read();
                    }
                    } catch (IOException e) {
                        System.out.println("No puedo leer el fichero" + e.getMessage());
                    }
                    
                } catch (FileNotFoundException e) {
                    System.out.println("Hubo un error" + e.getLocalizedMessage());
                }
                System.out.println("*******LEER CON UN ARRAY DE BYTES*******");
                //LEER FICHEROS CON UN ARRAY DE BYTES
                try{
                    //leer el fichero
                    InputStream fichero3 = new FileInputStream("/etc/passwd");
                    //guardar el contenido del fichero
                    try {
                        //crea un array de 5 elementos donde guarad lo que va leyendo, por lo que lee los datos del fichero de 5 en 5
                        byte datos[] = new byte[5];
                        // nos devuelve números
                        int dato = fichero3.read(datos);
                        //while que lee la variable datos uno a uno hasta que se acaban los datos (EOF = "End Of File")
                        while (dato != -1){
                        //imprimimos el dato
                        System.out.print(datos.toString());
                        //actualizamos la variable dato en cada interacción del bucle
                        dato = fichero3.read(datos);
                    }
                    } catch (IOException e) {
                        System.out.println("No puedo leer el fichero" + e.getMessage());
                    }
                    
                } catch (FileNotFoundException e) {
                    System.out.println("Hubo un error" + e.getLocalizedMessage());
                }
                System.out.println("******* LEER CON BUFFERED INPUT STREAM *******");
                //LEER FICHEROS CON UN BUFFEREDINPUTSTREAM
                try{
                    //BufferedInputStream no lee ficheros, por lo que tenemos que guardar los datos del fichero en una variable
                    InputStream miFichero = new FileInputStream("/etc/passwd");
                    BufferedInputStream fichero4 = new BufferedInputStream(miFichero);
                    //guardar el contenido del fichero
                    try {
                        //BufferedInputStream se ocupa de ir leyendo y guardando los datos según los vamos necesitando
                        int dato = fichero4.read();
                        //while que lee la variable datos uno a uno hasta que se acaban los datos (EOF = "End Of File")
                        while (dato != -1){
                        //imprimimos el dato
                        System.out.print((char)dato);
                        dato = fichero4.read();
                    }
                    } catch (IOException e) {
                        System.out.println("No puedo leer el fichero" + e.getMessage());
                    }
                    
                } catch (FileNotFoundException e) {
                    System.out.println("Hubo un error" + e.getLocalizedMessage());
                }
    }
}
