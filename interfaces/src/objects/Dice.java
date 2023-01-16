package objects;

import java.awt.*;
import java.util.Random;

public class Dice
{
    private int sides;
    private Color color;
    private int sideUp;

    public Dice(int sides, Color color)
    {
        this.sides = sides;
        this.color = color;
        sideUp = 1;
    }

    @Override
    public String toString()
    {
        return sides + " sided dice - " + sideUp;
    }
}

