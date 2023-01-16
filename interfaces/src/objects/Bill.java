package objects;

import java.time.LocalDate;

public class Bill
{
    private LocalDate dateIssued;
    private double value;
    private double collectableValue;

    public Bill(LocalDate dateIssued, double value,
                double collectableValue)
    {
        this.dateIssued = dateIssued;
        this.value = value;
        this.collectableValue = collectableValue;
    }

    @Override
    public String toString()
    {
        return "Bill (" + value + ")";
    }
}

