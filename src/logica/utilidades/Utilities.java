/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.utilidades;

import javax.swing.JTextField;

/**
 * 
 *
 * @author Nicolas
 */
public class Utilities {

    public static boolean comprobarNumeros(String cadena) {
        // expresion regular
        return cadena.matches(".*[0-9].*");
    }

    public static void setearVacio(JTextField txt) {
        txt.setText("");
    }


}
