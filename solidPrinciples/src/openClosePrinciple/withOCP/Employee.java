package openClosePrinciple.withOCP;


public abstract class Employee {
    private long id;
    private String name;
    private String department;
    private boolean work;

    public Employee(long id, String name, String department, boolean work) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.work = work;
    }

    abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", work=" + work +
                '}';
    }
}
