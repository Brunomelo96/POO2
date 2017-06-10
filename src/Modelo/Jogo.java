package Modelo;

import javax.swing.JOptionPane;

import Visao.Cenario1;
import Visao.TelaInicial;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;
import jplay.Mouse;

public class Jogo {
	
	public static void main(String[] args) {
		Window janela = new Window(800,600);
		Keyboard teclado = janela.getKeyboard();
		Mouse mouse = janela.getMouse();
		
		TelaInicial ini = new TelaInicial(janela,teclado,mouse);
		//janela.update();
		
	}
	
}
