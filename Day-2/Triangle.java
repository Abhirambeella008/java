import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double perimeter = a+b+ c;
        double s = perimeter/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s - c)); 
        System.out.println("Perimeter ="+perimeter);
        System.out.println("Area ="+ area);
    }
}
