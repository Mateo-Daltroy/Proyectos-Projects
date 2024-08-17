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
public class Peon extends Pieza {
    private boolean primerMov = true;
    
    @Override
    public void posicionesDisponibles(){ //Falta implementar que tome en diagonal
        int latBase = this.getPos().getLatitud();
        int longBase = this.getPos().getLongitud();
        Posicion aux;
        int multColor;
        if (super.getColor().equals("Blanco")){
            multColor = 1;
        } else {
            multColor = -1;
        }
        if (primerMov){
            aux = new Posicion(latBase + (2 * multColor), longBase);
            super.posibleElem(aux);
            setPrimerMov(false);
        }
        for (int i = -1; i < 2; i++){
            aux = new Posicion(latBase + (1 * multColor), longBase + i);
            super.posibleElem(aux);
        }
    }

    public void setPrimerMov(boolean primerMov) {
        this.primerMov = primerMov;
    }
}
