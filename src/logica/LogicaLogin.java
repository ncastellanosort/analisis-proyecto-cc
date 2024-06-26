/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashMap;
import logica.administrativos.Administrativos;
import logica.contador.Contador;
import logica.mantenimiento.PersonalMantenimiento;
import logica.seguridad.Seguridad;
import logica.serviciosGenerales.PersonalServiciosGenerales;

/**
 *
 * @author Nicolas
 */
public class LogicaLogin {

    private static final HashMap<String, String> accesos = new HashMap<>() {
        {
            put(Administrativos.getUsuarioAdministrativo(), Administrativos.getClaveAdministrativo());
            put(Contador.getUsuarioContador(), Contador.getClaveContador());
            put(PersonalMantenimiento.getUSUARIOMANTENIMIENTO(), PersonalMantenimiento.getCLAVEMANTENIMIENTO());
            put(Seguridad.getUSUARIOSEGURIDAD(), Seguridad.getCLAVESEGURIDAD());
            put(PersonalServiciosGenerales.getUSUARIOSERVICIOSGENERALES(), PersonalServiciosGenerales.getCLAVESERVICIOSGENERALES());

        }
    };

    //        Iterator<Map.Entry<String, String>> iterador = LogicaLogin.getAccesos().entrySet().iterator();
//
//        while (iterador.hasNext()) {
//            Map.Entry<String, String> entry = iterador.next();
//            String usuario  = entry.getKey();
//            String contraseña  = entry.getValue();
//
//        }
    public static HashMap<String, String> getAccesos() {
        return accesos;
    }

}
