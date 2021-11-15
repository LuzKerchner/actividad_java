/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7.codo.a.codo;

import java.util.Scanner;

/**
 *
 * @author Gallinita10
 */
public class Ejercicio7CodoACodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido, hobbie, editorCodigoPrefer, sistOperativo;
        int edad;
        
        
        System.out.print("Ingrese su nombre: ");
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();
        
        System.out.print("Apellido: ");
        scan = new Scanner(System.in);
        apellido = scan.nextLine();
        
        System.out.print("Edad: ");
        scan = new Scanner(System.in);
        edad = scan.nextInt();
        
        System.out.print("Hobbie: ");
        scan = new Scanner(System.in);
        hobbie = scan.nextLine();
        
        System.out.print("Editor de código preferido: ");
        scan = new Scanner(System.in);
        editorCodigoPrefer = scan.nextLine();
        
        System.out.print("Sistema Operativo: ");
        scan = new Scanner(System.in);
        sistOperativo = scan.nextLine();
        
        System.out.println(" ");       
        System.out.println("-------------------------");
        System.out.println("Bienvenido al Sistema");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de código favorito: " + editorCodigoPrefer);
        System.out.println("Sistema operativo: " + sistOperativo);
   
    }
    
}
