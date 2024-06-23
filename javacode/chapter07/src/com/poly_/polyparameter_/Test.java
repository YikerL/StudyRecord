package com.poly_.polyparameter_;

public class Test {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "的年薪是" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Laborer) {
            ((Laborer) e).work();

        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println(e.getName() + "不是经理也不是普通员工");
        }
    }
}
