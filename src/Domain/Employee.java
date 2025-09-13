package Domain;

public class Employee {
    private String name;
    private Integer age;
    private Long salary;

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, Integer age, Long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(String name, Integer age, Long salary,String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
