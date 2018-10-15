package ch19_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/10/15 13:16
 */
public class ConcreateCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreateCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        String str = "";
        for (int i = 0; i < depth; i++) {
            str += "-";
        }

        System.out.println(str+name);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
