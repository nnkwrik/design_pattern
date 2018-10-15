package ch19_composite;

/**
 * Created by nnkwrik
 * 18/10/15 13:20
 * 相当于叶节点
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        String str = "";
        for (int i = 0; i < depth; i++) {
            str += "-";
        }

        System.out.println(str+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
