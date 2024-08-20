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
public class Caballero extends Pieza{
    private static final int dimF = 8;

    public Caballero(String color, Posicion pos) {
        super(color, pos, dimF);
    }
    
    
    @Override
    public void posicionesDisponibles(){ 
        /* Debe de ser imposible hacer codigo mas feo que este, 
           pero dadas las posiciones relativas del caballero
           no veo como hacer que se consiga una lista apropiada de otra manera */
        int latBase = this.getPos().getLatitud();
        int longBase = this.getPos().getLongitud();
        Posicion aux = new Posicion(latBase - 1, longBase + 2);
        super.posibleElem(aux);
        aux = new Posicion(latBase + 1, longBase + 2);
        super.posibleElem(aux);
        aux = new Posicion(latBase + 2, longBase + 1);
        super.posibleElem(aux);
        aux = new Posicion(latBase + 2, longBase - 1);
        super.posibleElem(aux);
        aux = new Posicion(latBase + 1, longBase - 2);
        super.posibleElem(aux);
        aux = new Posicion(latBase - 1, longBase - 2);
        super.posibleElem(aux);
        aux = new Posicion(latBase - 2, longBase - 1);
        super.posibleElem(aux);
        aux = new Posicion(latBase - 2, longBase + 1);
        super.posibleElem(aux);
    }
}
