package abstract_;

public class Exercise01 {
    public static void main(String[] args) {
        Employee tom = new Manager("Tom", 27, 6000, 500);
        tom.work();
        CommonEmployee jack = new CommonEmployee("jack", 19, 5000);
        jack.work();
    }
}


abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    private double bonue;

    public Manager(String name, int id, double salary, double bonue) {
        super(name, id, salary);
        this.bonue = bonue;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }
}