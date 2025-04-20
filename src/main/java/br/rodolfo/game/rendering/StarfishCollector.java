package br.rodolfo.game.rendering;

import br.rodolfo.game.actors.BaseActor;
import br.rodolfo.game.actors.GameBeta;
import br.rodolfo.game.actors.Starfish;
import br.rodolfo.game.actors.Turtle;

public class StarfishCollector extends GameBeta {

    private Turtle turtle;
    private Starfish starfish;
    private BaseActor ocean;

    public void initialize() {
        ocean = new BaseActor(0, 0, mainStage);
        ocean.loadTexture("images/water.jpg");
        ocean.setSize(800, 600);

        starfish = new Starfish(380, 380, mainStage);

        turtle = new Turtle(20, 20, mainStage);
    }

    @Override
    public void update(float dt) {
        
    }

}
