package groups;

public class IntegerPair extends ArrangeableGroup {
    private int first;
    private int second;

    public IntegerPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void arrange() {
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }
}

