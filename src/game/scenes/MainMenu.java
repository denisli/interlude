package game.scenes;

import java.util.Arrays;
import java.util.List;

import game.Interlude;
import game.InterludeGame;
import game.buttons.Button;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class MainMenu implements Scene {
    private final List<Button> buttons;
    private String name = "Main Menu";

    public MainMenu() {
        this.buttons = Arrays.asList(Button.playButton(0.5f,0.5f),Button.instructionsButton(0.5f,0.6f),Button.controlsButton(0.5f,0.7f));
    }
    
    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        for (Button button : buttons) {
            button.render(g);
        }
    }

    @Override
    public void update(int t) {
        // TODO Auto-generated method stub
        for (Button button : buttons) {
            button.update(t);
        }
    }
    
    @Override
    public void init() {
        for (Button button : buttons) {
            button.init();
        }
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public Scene parentScene() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Main menu has no parent scene!");
    }
    
    @Override
    public void fireActivatedButtons() {
        Input input = Interlude.GAME_CONTAINER.getInput();
        for (Button button : buttons) {
            if (button.isClicked(input)) {
                button.callEffect();
            }
        }
    }
}
