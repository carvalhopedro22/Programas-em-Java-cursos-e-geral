import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double n1,n2,notafinal;
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    notafinal = n1 + n2;
    
    if(notafinal < 60.0){
        System.out.println("REPROVADO");
    }

    System.out.printf("NOTA FINAL = R$ %.1f%n",notafinal);
    sc.close();  
  }
}