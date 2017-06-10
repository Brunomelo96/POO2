package Visao;

import jplay.Scene;
import jplay.Sprite;
import jplay.Window;

public class Cenario1 {

	private Window janela;
	private Scene cena;

	public Cenario1(Window window){
		janela = window;
		cena = new Scene();
		cena.loadFromFile("src/recursos/scn/Cenario1.scn");
		
		run();
		
	}
	
	public void run(){
		while(true){
			cena.draw();
			janela.update();
		}
	}
	
}
