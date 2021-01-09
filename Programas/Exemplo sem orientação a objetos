import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
	double xa,xb,xc,ya,yb,yc; 
    
    System.out.println("Enter the measures of triangle X: ");
    xa = sc.nextDouble();
    xb = sc.nextDouble();
    xc = sc.nextDouble();
    
    System.out.println("Enter the measures of triangle Y: ");
    ya = sc.nextDouble();
    yb = sc.nextDouble();
    yc = sc.nextDouble();

    double p = (xa + xb + xc)/2;
    double areax = Math.sqrt(p * (p-xa) * (p-xb) * (p-xc));

    p = (ya + yb + yc)/2;
    double areay = Math.sqrt(p * (p-ya) * (p-yb) * (p-yc));

    System.out.printf("Triangle X area: %.4f%n", areax);
    System.out.printf("Triangle Y area: %.4f%n", areay);

    if(areax > areay){
        System.out.println("Area maior: Triangulo x");
    }else{
        System.out.println("Area maior: Triangulo y");
    }
	
    sc.close();  
  }
}