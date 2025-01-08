package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private List<String> hobbies = new ArrayList<>();

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
}