/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.revisorFiscal;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class RevisorFiscal {

    public static HashMap<String, String> claveValor = new HashMap<>() {
        {
            put("Nicolas", "12");
        }   
    };
    
    public static HashMap<String, String> getEmployes(){
        return claveValor;
    }


}
