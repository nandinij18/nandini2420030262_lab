package lab1;
import java.util.Scanner;
public class volume {
public static void main(String[] args) {
			int r;
			float pi=3.14f;
			System.out.print("Enter the radius");
			Scanner sc=new Scanner(System.in);
			r=sc.nextInt();
			System.out.print("Volume of Sphere is:"+(4/3*pi*r*r));
}
}
