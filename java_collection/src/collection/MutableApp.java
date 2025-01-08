package collection;
import data.Person;
import java.util.ArrayList;
import java.util.List;

public class MutableApp {

    public static void main(String[] args) {

        Person person = new Person();
        person.addHobby("Badminton");
        person.addHobby("Sepakbola");

        doSomethingWithHobbies(new ArrayList<>(person.getHobbies())); 

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby"); 
    }
}