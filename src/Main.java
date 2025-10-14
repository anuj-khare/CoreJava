import Domain.BankAccount;
import Domain.Person;

/*
tradeId,symbol,price,quantity,timestamp

  1001,AAPL,189.20,50,2025-08-22T09:15:00

  1002,TSLA,245.10,20,2025-08-22T09:16:30

  1003,AAPL,190.00,10,2025-08-22T09:17:00

  1004,IBM,135.50,100,2025-08-22T09:18:20  Columns:  tradeId → Unique trade identifier


  symbol → Instrument symbol (partitioning key)

  price → Trade execution price

  quantity → Number of units traded



  timestamp → Trade time

Output Specification  

For each distinct symbol in the input file, create a separate CSV file named <symbol>.csv



  Each output file must contain:  A header row identical to the input



  All trade records for that symbol  From the sample above, generate:



  AAPL.csv



  tradeId,symbol,price,quantity,timestamp



  1001,AAPL,189.20,50,2025-08-22T09:15:00



  1003,AAPL,190.00,10,2025-08-22T09:17:00


 */

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