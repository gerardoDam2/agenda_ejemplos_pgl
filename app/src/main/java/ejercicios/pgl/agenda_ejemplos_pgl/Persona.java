package ejercicios.pgl.agenda_ejemplos_pgl;

import java.io.Serializable;

/**
 * Created by Gerardo on 17/11/2016.
 */

public class Persona implements Serializable {
    private String nombre;
    private String mumero;

    public Persona(String nombre, String mumero) {
        this.nombre = nombre;
        this.mumero = mumero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return mumero;
    }

    public void setMumero(String mumero) {
        this.mumero = mumero;
    }
}
