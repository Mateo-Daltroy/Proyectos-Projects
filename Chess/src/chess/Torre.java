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
public class Torre extends Pieza {
    private static final int dimF = 14;

    public Torre(String color, Posicion pos) {
        super(color, pos, dimF);
    }
    @Override
    public void posicionesDisponibles(){
        int longBase = this.getPos().getLongitud();
        int latBase = this.getPos().getLatitud();
        int longMod = 1;
        int latMod = 1;
        boolean inBounds;
        Posicion aux;
        for (int i = 1; 1 < 5; i++){ // Esta logica fue armada a las 2am, no confiar 
            int j = 1;
            inBounds = true;
            if (i % 2 == 1){ 
                while (j < 8 && inBounds){
                    aux = new Posicion(latBase + (j * latMod), longBase);
                    inBounds = super.posibleElem(aux);
                    j++;
                }
            } else {
                while (j < 8 && inBounds){
                    aux = new Posicion(latBase, longBase + (j * longMod));
                    inBounds = super.posibleElem(aux);
                    j++;
                }
            }
            if (i % 2 == 1){
                latMod = latMod * (-1);
            } else {
                longMod = longMod * (-1);
            }
        }
    }
}
