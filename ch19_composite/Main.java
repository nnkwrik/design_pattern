package ch19_composite;

/**
 * Created by nnkwrik
 * 18/10/15 13:01
 * 组合模式　：将对象组合成树形结构表示'部分-整体'的层次结构.组合模式使得用户对单个对象和组合对象的使用具有一致性
 */
public class Main {
    public static void main(String[] args) {
        ConcreateCompany root = new ConcreateCompany("总公司");
        root.add(new HRDepartment("rootHR"));
        root.add(new HRDepartment("rootFD"));

        ConcreateCompany comp = new ConcreateCompany("comp");
        comp.add(new HRDepartment("compHR"));
        comp.add(new HRDepartment("compFD"));
        root.add(comp);

        ConcreateCompany comp1 = new ConcreateCompany("comp1");
        comp1.add(new HRDepartment("comp1HR"));
        comp1.add(new HRDepartment("comp1FD"));
        comp.add(comp1);

        ConcreateCompany comp2 = new ConcreateCompany("comp2");
        comp2.add(new HRDepartment("comp2HR"));
        comp2.add(new HRDepartment("comp2FD"));
        comp.add(comp2);

        root.display(1);
        System.out.println("-----------------");
        root.lineOfDuty();



    }
}
