/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
/**
 * @author panos
 */
public class Game extends BasicGame
{
    public Game()
    {
        super("Wizard game");
    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new Game());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer container) throws SlickException
    {
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    }

    public void render(GameContainer container, Graphics g) throws SlickException
    {
    }
}