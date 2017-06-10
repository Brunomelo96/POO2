package Modelo;

import jplay.Sprite;

public class Jogador extends Sprite{

	public Jogador(int x, int y) {
		super("src/recursos/sprites/jogador.png",20);
		this.x = x;
		this.y = y;
	}

}
