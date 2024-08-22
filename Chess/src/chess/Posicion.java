/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author mateo
 */
public class Posicion {
    private int latitud;
    private int longitud;

    public Posicion(int longitud, int latitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return ("[" + latitud + ", " + longitud + ']');
    }
    
}
