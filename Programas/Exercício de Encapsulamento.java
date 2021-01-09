import java.util.Scanner;
import entities.Account;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account acc; //acc é o objeto
    
    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String holder = sc.nextLine(); //holder = titular
    System.out.print("Is there an initial deposit (y/n)? ");
    char response = sc.next().charAt(0);
    if (response == 'y'){
        System.out.print("Enter initial deposit value: ");
        double initialDeposit = sc.nextDouble();
        acc = new Account(number,holder,initialDeposit);
    } else {
        acc = new Account(number,holder);
    }

    System.out.println();
    System.out.println("Account data: ");

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble();
    acc.deposit(depositValue);
    System.out.println("Updated account data: ");
    System.out.println(acc);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    double withdrawValue = sc.nextDouble();
    acc.withdraw(withdrawValue);
    System.out.println("Updated account data: ");
    System.out.println(acc);

    sc.close();
  }
}