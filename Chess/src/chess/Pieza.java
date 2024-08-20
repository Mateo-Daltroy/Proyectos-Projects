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
public abstract class Pieza {
    private String color;
    private Posicion pos;               //Posicion actual
    private Posicion[] Posiciones; //Posiciones disponibles
    private int dimL;
    
    public abstract void posicionesDisponibles();

    public Pieza(String color, Posicion pos, int dimF) {
        this.color = color;
        this.pos = pos;
        this.Posiciones = new Posicion[dimF];
        this.dimL = 0;
    }
    
    // Checkea si la posicion a la que quiere mover el usuario esta habilitada para la pieza
    public boolean isPosible (Posicion x){
        for (int i = 0; i < this.dimL; i++){
            if (Posiciones[i] == x){
                return(true);
            }
        }
        return(false);
    }
    
    //In-Bounds checker
    public boolean posibleElem(Posicion x){
        if ((x.getLatitud() < 8 && x.getLatitud() > -1) && (x.getLongitud() < 8 && x.getLongitud() > -1)){
            this.Posiciones[this.dimL] = x;
            this.dimL++;
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

    public Posicion[] getPosiciones() {
        return Posiciones;
    }

    public int getDimL() {
        return dimL;
    }
}
