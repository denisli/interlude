package game.labels;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.UnicodeFont;

import game.SimpleFont;
import game.Interlude;
import game.Renderable;

public class Label implements Renderable {
    private final String text;
    private final float fractionX;
    private final float fractionY;
    private final Color color;
    private final UnicodeFont font;
    
    public Label( String text, float fractionX, float fractionY, Color color, UnicodeFont font ) {
        this.text = text;
        this.fractionX = fractionX;
        this.fractionY = fractionY;
        this.color = color;
        this.font = font;
    }
    
    public static Label interludeLabel() {
        String text = "Interlude";
        float fractionX = 0.5f;
        float fractionY = 0.15f;
        Color color = Color.gray;
        UnicodeFont font = SimpleFont.retrieve( "Arial", Font.PLAIN, 54 );
        return new Label( text, fractionX, fractionY, color, font );
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        int containerWidth = Interlude.GAME_CONTAINER.getWidth();
        int containerHeight = Interlude.GAME_CONTAINER.getHeight();
        int textWidth = font.getWidth(text);
        int textHeight = font.getHeight(text);
        g.setFont(font);
        g.setColor(color);
        g.drawString( text, fractionX * containerWidth - textWidth / 2, fractionY * containerHeight - textHeight / 2 );
    }

    @Override
    public void update(int t) {
        // TODO Auto-generated method stub
        return;
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        return;
    }
}