package bitlab.techorda.g1.sprintfirst.db;

import bitlab.techorda.g1.sprintfirst.model.Developer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {

    @Getter
    private static List<Developer> developers = new ArrayList<>();
    private static Long id = 6L;

    static {
        developers.add(new Developer(1L, "Pau", "Cubarsi", 80, "B"));
        developers.add(new Developer(2L, "Leo", "Messi", 100, "A"));
        developers.add(new Developer(3L, "Harry", "Maguire", 25, "F"));
        developers.add(new Developer(4L, "Lamine", "Yamal", 75, "B"));
        developers.add(new Developer(5L, "Kylian", "Mbappe", 90, "A"));
    }

    public static void createDeveloper(Developer developer) {
        developer.setId(id);
        id++;
        developers.add(developer);
    }
}
