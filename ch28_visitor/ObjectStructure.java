package ch28_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/10/15 16:41
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();


    public void attach(Person person){
        elements.add(person);
    }

    public void detach(Person person){
        elements.remove(person);
    }

    public void display(Action visitor){
        for (Person p : elements) {
            p.accept(visitor);
        }
    }
}
