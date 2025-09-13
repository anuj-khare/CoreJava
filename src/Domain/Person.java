package Domain;

public class Person {
    private int age;
    private String name;
    private String lastName;
    public Person(){

    }
    public Person(int age,String name,String lastName){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public void setAge(int age){
        if(age <0 || age > 110){
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "This Person's details are :{" +

                " name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
