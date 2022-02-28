/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Faxx
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creando mi almacenamiento para mis usuarios
        Usuario[] usuarios = new Usuario[10];
        int contador = 1;
        
        // usuario por defecto creado - Administrador
        // colocado en la primera posicion del arreglo
        usuarios[0] = new Usuario(202106538,"Diego","Pérez","202106538");

        
        Login login = new Login(usuarios);
        login.setVisible(true);
    }
    
}
