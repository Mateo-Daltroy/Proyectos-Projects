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
public class Alfil extends Pieza {
    private static final int dimF = 13;

    public Alfil(String color, Posicion pos) {
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
        for (int i = 1; 1 < 5; i++){
            int j = 1;
            inBounds = true;
            while (j < 8 && inBounds){
                aux = new Posicion(latBase + (j * latMod), longBase + (j * longMod));
                inBounds = super.posibleElem(aux);
                j++;
            }
            if (i % 2 == 1){
                latMod = latMod * (-1);
            } else {
                longMod = longMod * (-1);
            }
        }
    }
}
