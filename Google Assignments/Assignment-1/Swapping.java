import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first No:");
		int a = sc.nextInt();
		System.out.println("Enter the second No:");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The values of a and b after swapping is a = "+a+" and b = "+b);
	}
}
