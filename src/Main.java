import Domain.BankAccount;
import Domain.Person;

public class Main{
    public static void main(String[] args) {
//        Person p = new Person();
//        p.setName("Anuj");
//        p.setLastName("khare");
//        p.setAge(11);
//        System.out.println(p);
        BankAccount b = new BankAccount();
        b.deposit(1000);
        System.out.println(b.getBalance());
        b.withDraw(100);
        System.out.println(b.getBalance());
    }
}