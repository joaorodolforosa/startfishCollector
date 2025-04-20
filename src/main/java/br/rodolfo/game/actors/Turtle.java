package br.rodolfo.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 *
 * @author Joao Rodolfo
 */
public class Turtle extends BaseActor {
    
    public Turtle(float x, float y, Stage s) {
        super(x, y, s);
        
        String[] fileNames = {"images/turtle-1.png", "images/turtle-2.png",
            "images/turtle-3.png", "images/turtle-4.png", "images/turtle-5.png",
            "images/turtle-6.png"};
        
        loadAnimationFromFiles(fileNames, 0.1f, true);
        
        setAcceleration(400);
        setMaxSpeed(100);
        setDeceleration(400);
    }
    
    @Override
    public void act(float dt) {
        super.act(dt);
        
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            accelerateAtAngle(180);
        }
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            accelerateAtAngle(0);
        }
        if (Gdx.input.isKeyPressed(Keys.UP)) {
            accelerateAtAngle(90);
        }
        if (Gdx.input.isKeyPressed(Keys.DOWN)) {
            accelerateAtAngle(270);
        }
        
        applyPhysics(dt);
        
        setAnimationPaused(!isMoving());
        
        if (getSpeed() > 0) {
            setRotation(getMotionAngle());
        }
    }
}
