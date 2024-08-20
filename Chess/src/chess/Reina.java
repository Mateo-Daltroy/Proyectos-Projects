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
public class Reina extends Pieza {
    private static final int dimF = 27;

    public Reina(String color, Posicion pos) {
        super(color, pos, dimF);
    }
    
    @Override
    public void posicionesDisponibles(){
        Alfil A = new Alfil(this.getColor(), this.getPos());
        Torre T = new Torre(this.getColor(), this.getPos());
        A.posicionesDisponibles();
        Posicion[] PosicionesAlf = A.getPosiciones();
        for (int i = 0; i < A.getDimL(); i++){
            super.posibleElem(PosicionesAlf[i]);
        }
        T.posicionesDisponibles();
        Posicion[] PosicionesTor = T.getPosiciones();
        for (int i = 0; i < T.getDimL(); i++){
            super.posibleElem(PosicionesTor[i]);
        }
    }
}
