/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import ui.login.Login;

/**
 *
 * @author Nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Login pantalla = new Login();

        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);
        pantalla.setVisible(true);

    }

}
