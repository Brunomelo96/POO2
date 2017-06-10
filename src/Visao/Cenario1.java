package Visao;

import Modelo.Jogador;
import jplay.Scene;
import jplay.Sprite;
import jplay.Window;

public class Cenario1 {

	private Window janela;
	private Scene cena;
	private Jogador jogador;
	private Sprite conversa1;

	public Cenario1(Window window){
		janela = window;
		cena = new Scene();
		cena.loadFromFile("src/recursos/scn/Cenario1.scn");
		jogador = new Jogador(500,320);
		conversa1 = new Sprite("src/recursos/sprites/conversa.png");
		conversa1.x = 400;
		conversa1.y = 200;
		run();
		
	}
	
	public void run(){
		while(true){
			cena.draw();
			jogador.draw();
			conversa1.draw();
			janela.update();
		}
	}
	
}
