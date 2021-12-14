package Java.com.javaChapter16.exercise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElimination {
    private final Set<String> names;

    public DuplicateElimination() {
        this.names = new HashSet<>();
    }

    public Set<String> getNames() {
        return names;
    }

    public void setName(String name) {
        names.add(name);
    }

    public void saveNames(String... names){
        Collections.addAll(this.names, names);
    }
}
