package HWSeven.TaskThree;

import java.util.HashSet;
import java.util.Set;

public class UnionSet {

    public static Set<Object> union(Set<Object> set1, Set<Object> set2) {

        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);

        return result;
    }

    public static Set<Object> intersect(Set<Object> set1, Set<Object> set2) {

        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.retainAll(set2);

        return result;
    }
}
