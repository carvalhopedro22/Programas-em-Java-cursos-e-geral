import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String x;
    x = sc.next();
    
    int y;
    y = sc.nextInt();

    double z;
    z = sc.nextDouble();

    char w;
    w = sc.next().charAt(0);

    System.out.println("Você digitou: "+ x);
    System.out.println("Você digitou: "+ y);
    System.out.println("Você digitou: "+ z);
    System.out.println("Você digitou: "+ w);
    
    sc.close();
  }
}