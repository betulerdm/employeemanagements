public class Employee extends Person{
    protected String workerId;
    protected double salary;
    protected String age ;
    Employee(String name, String surname, String workerId, double salary,String age) {
        super(name, surname);
        this.workerId = workerId;
        this.salary = salary;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "workerId='" + workerId + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


