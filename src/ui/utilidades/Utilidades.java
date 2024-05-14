/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.utilidades;

import javax.swing.JTable;

/**
 *
 * @author Nicolas
 */
public class Utilidades {

    public static void escalarLargoTablas(int tamanoColumnas, JTable tabla) {
        for (int i = 0; i < tamanoColumnas; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(200);

        }
    }

}
