package objects;

import java.util.Random;

public class Coin
{
    //true = heads up, false = tails up
    private boolean orientation;
    private double value;

    public Coin(boolean orientation,
                double value)
    {
        this.orientation = orientation;
        this.value = value;
    }

    @Override
    public String toString()
    {
        String orient = orientation ? "heads" : "tails";
        return "Coin (" + value  + ") - " + orient;
    }
}

