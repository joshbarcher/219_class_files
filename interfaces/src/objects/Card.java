package objects;

public class Card
{
    private String description;
    private double collectableValue;

    public Card(String description, double value)
    {
        this.description = description;
        this.collectableValue = value;
    }

    @Override
    public String toString()
    {
        return "A " + description + " card, worth $" + collectableValue;
    }
}

