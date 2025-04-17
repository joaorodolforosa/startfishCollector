package br.rodolfo.game.rendering;

import br.rodolfo.game.actors.ActorBeta;
import br.rodolfo.game.actors.Turtle;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class StarfishCollectorBeta extends Game {

    private SpriteBatch batch;

    private Turtle turtle;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;

    private Stage mainStage;
    private boolean win;

    @Override
    public void create() {

        mainStage = new Stage();

        ocean = new ActorBeta();
        ocean.setTexture(new Texture(Gdx.files.internal("images/water.jpg")));
        mainStage.addActor(ocean);

        starfish = new ActorBeta();
        starfish.setTexture(new Texture(Gdx.files.internal("images/starfish.png")));
        mainStage.addActor(starfish);

        turtle = new Turtle();
        turtle.setTexture((new Texture(Gdx.files.internal("images/turtle-1.png"))));
        mainStage.addActor(turtle);

        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture(Gdx.files.internal("images/you-win.png")));
        winMessage.setPosition(180, 180);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        win = false;

    }

    @Override
    public void render() {
        mainStage.act(1/60f);
        
        if(turtle.overlaps(starfish)) {
            starfish.remove();
            winMessage.setVisible(true);
        }

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        mainStage.draw();
    }

}
