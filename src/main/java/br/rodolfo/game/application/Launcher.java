package br.rodolfo.game.application;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import br.rodolfo.game.rendering.StarfishCollector;

public class Launcher {
	
	public static void main(String[] args) {
		Game myGame = new StarfishCollector();
		LwjglApplication launcher = new LwjglApplication(myGame, "StarfishCollector", 800, 600);
	}

}
