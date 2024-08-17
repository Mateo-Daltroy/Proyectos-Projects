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
    @Override
    public void posicionesDisponibles(){
        Alfil A = new Alfil();
        Torre T = new Torre();
        A.posicionesDisponibles();
        LinkedList<Posicion> Posiciones = A.getPosiciones();
        T.posicionesDisponibles();
        Posiciones.addAll(T.getPosiciones());
        super.setPosiciones(Posiciones);
    }
}
