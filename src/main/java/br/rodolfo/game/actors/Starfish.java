
package br.rodolfo.game.actors;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

/**
 *
 * @author Joao Rodolfo
 */
public class Starfish extends BaseActor {
    
    public Starfish(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("images/starfish.png");
        
        Action spin = Actions.rotateBy(30, 1);
        this.addAction(Actions.forever(spin));
    }
    
}
