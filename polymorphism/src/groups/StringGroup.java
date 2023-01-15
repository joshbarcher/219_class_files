package groups;

import java.util.Arrays;

public class StringGroup extends ArrangeableGroup {
    private String[] group;

    public StringGroup(String... elements) {
        group = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            group[i] = elements[i];
        }
    }

    @Override
    public void arrange() {
        Arrays.sort(group);
    }

    @Override
    public String toString() {
        return Arrays.toString(group);
    }
}

