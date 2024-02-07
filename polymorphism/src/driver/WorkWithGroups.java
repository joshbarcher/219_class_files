package driver;

import groups.ArrangeableGroup;
import groups.IntegerPair;
import groups.StringGroup;

public class WorkWithGroups {
    public static void main(String[] args) {
        ArrangeableGroup pair = new IntegerPair(30, -10);
        ArrangeableGroup strings = new StringGroup(
                "not", "and", "or", "but", "then");

    }

    public static void arrange(ArrangeableGroup group) {
        group.arrange();
        System.out.println(group);
    }
}
