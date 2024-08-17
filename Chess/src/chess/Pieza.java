/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;


import java.util.LinkedList;
/**
 *
 * @author mateo
 */
public abstract class Pieza {
    private String color;
    private Posicion pos;
    private LinkedList<Posicion> Posiciones = new LinkedList<>();
    
    public abstract void posicionesDisponibles();
    
    public boolean isPosible (Posicion x){
        if (this.Posiciones.contains(x)){
            return(true);
        } else {
            return(false);
        }
    }
    
    public boolean posibleElem(Posicion x){
        if ((x.getLatitud() < 8 && x.getLatitud() > -1) && (x.getLongitud() < 8 && x.getLongitud() > -1)){
            this.Posiciones.add(x);
            return(true);
        } else {
            return(false);
        }
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public LinkedList<Posicion> getPosiciones() {
        return Posiciones;
    }

    public void setPosiciones(LinkedList<Posicion> Posiciones) {
        this.Posiciones = Posiciones;
    }
}
