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
public class Board {
    private Pieza[][] tablero = new Pieza[8][8]; // Coordenadas [x][y] 0-7

    public Board() {
        Posicion Pos;
        String color;
        this.iniPeones();
        this.iniPiezas();
    }
    
    private void iniPeones(){
        for (int i = 0; i < 8; i++){ // For establece los peones
            this.tablero[i][1] = new Peon("Blanco", new Posicion(i, 1));
            this.tablero[i][6] = new Peon("Negro", new Posicion(i, 6));
        }
    }
    
    private void iniPiezas(){
        String color = new String("Blanco");
        int lat = 0;
        for (int i = 0; i < 2; i++){
            if ((i % 2) != 0){
                color = new String("Negro");
                lat = 7;
            }
            this.tablero[0][lat] = new Torre(color, new Posicion(0, lat));
            this.tablero[1][lat] = new Caballero(color, new Posicion(1, lat));
            this.tablero[2][lat] = new Alfil(color, new Posicion(2, lat));
            this.tablero[3][lat] = new Reina(color, new Posicion(3, lat));
            this.tablero[4][lat] = new Rey(color, new Posicion(4, lat));
            this.tablero[5][lat] = new Alfil(color, new Posicion(5, lat));
            this.tablero[6][lat] = new Caballero(color, new Posicion(6, lat));
            this.tablero[7][lat] = new Torre(color, new Posicion(7, lat));
        }
    }
}