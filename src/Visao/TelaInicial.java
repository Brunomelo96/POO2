package Visao;

import java.awt.event.MouseAdapter;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Sprite;
import jplay.Window;
import jplay.Mouse;

public class TelaInicial {
	
    Window janela;
	Sprite fundo;
	Sprite start;
	Keyboard teclado;
	Mouse mouse;
	boolean sair = false;
	
	public TelaInicial(Window window, Keyboard teclado, Mouse mouse){
		this.janela = window;
		this.teclado = teclado;
		this.mouse = mouse;
		carregarObjetos();
		loop();
	}
	
	private void carregarObjetos(){
		fundo = new Sprite("src/recursos/sprites/menu.png");
		start = new Sprite("src/recursos/sprites/start.png");
		start.width = 263;
		start.height = 46;
		start.x = 250;
		start.y = 300;
	}
	
	private void desenhar(){
		fundo.draw();
		start.draw();
		janela.update();
	}
	
	private void checaStart(){
		if(mouse.isOverObject(start) && mouse.isLeftButtonPressed()){
			Cenario1 cen = new Cenario1(janela);
			sair = true;
		}
		if(teclado.keyDown(Keyboard.ESCAPE_KEY)){
			System.exit(0);
		}
	}
	
	private void loop(){
		do{
			desenhar();
			checaStart();
		}while(sair == false);
	}
	
}
