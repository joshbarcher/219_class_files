package driver;

import groups.ArrangeableGroup;
import groups.IntegerPair;
import groups.NameGroup;
import groups.StringGroup;

public class WorkWithGroups {
    public static void main(String[] args) {
        ArrangeableGroup pair = new IntegerPair(30, -10);
        ArrangeableGroup strings = new StringGroup(
                "not", "and", "or", "but", "then");

        arrange(pair);
        arrange(strings);
    }

    public static void arrange(ArrangeableGroup group) {
        group.arrange();
        System.out.println(group);
    }
}
