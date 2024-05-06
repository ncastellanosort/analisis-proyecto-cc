/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.locales;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaLocales {
    private static HashMap<Integer, Local> localesCentroComercial = new HashMap<>();

    public static HashMap<Integer, Local> getLocalesCentroComercial() {
        return localesCentroComercial;
    }

    public static void setLocalesCentroComercial(HashMap<Integer, Local> localesCentroComercial) {
        ListaLocales.localesCentroComercial = localesCentroComercial;
    }
    
    
}
