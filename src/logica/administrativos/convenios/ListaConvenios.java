/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.administrativos.convenios;

import java.util.HashMap;

/**
 *
 * @author Nicolas
 */
public class ListaConvenios {

    private static HashMap<Integer, Convenio> listaConveniosCentroComercial = new HashMap<>();

    public static HashMap<Integer, Convenio> getListaConveniosCentroComercial() {
        return listaConveniosCentroComercial;
    }

    public static void setListaConveniosCentroComercial(HashMap<Integer, Convenio> listaConveniosCentroComercial) {
        ListaConvenios.listaConveniosCentroComercial = listaConveniosCentroComercial;
    }



}
