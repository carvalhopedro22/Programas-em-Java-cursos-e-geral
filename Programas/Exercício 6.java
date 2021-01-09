import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a;
    a = sc.nextInt();

    if(a > 0){
        System.out.println("POSITIVO");
    }else{
        System.out.println("NEGATIVO");
    }
    sc.close();  
  }
}