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
public class Rey extends Pieza {
    @Override
    public void posicionesDisponibles(){
        int latBase = this.getPos().getLatitud();
        int longBase = this.getPos().getLongitud();
        Posicion aux;
        int mod = 1;
        for (int j = 0; j < 2; j++){
            for (int i = -1; i < 2; i++){
                aux = new Posicion(latBase + i, longBase + mod);
                super.posibleElem(aux);
            }
            mod = -1;
        }
        /* Estos ultimos dos se pueden implementar dentro del for nesteado pero defiendo que
           preguntar el if 9 veces solo para no sumar la posicion del rey es mas ineficiente que 
           añadir las otras dos afuera */
        aux = new Posicion(latBase, longBase - 1);
        super.posibleElem(aux);
        aux = new Posicion(latBase, longBase + 1);
        super.posibleElem(aux);
    }
}
