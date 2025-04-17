package br.rodolfo.game.application;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import br.rodolfo.game.rendering.StarfishCollectorBeta;

public class LauncherBeta {
	
	public static void main(String[] args) {
		Game myGame = new StarfishCollectorBeta();
		LwjglApplication launcher = new LwjglApplication(myGame, "StarfishCollector", 800, 600);
	}

}
