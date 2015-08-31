package game.scenes.song_selection;

import game.Renderable;
import game.Updateable;

import org.newdawn.slick.MouseListener;

public interface Scroller extends Renderable, Updateable, MouseListener {
    public static Scroller songSelectionScroller() {
        Scroller scroller = SongSelectionScroller.getSongSelectionScroller();
        scroller.init();
        return scroller;
    }
}
