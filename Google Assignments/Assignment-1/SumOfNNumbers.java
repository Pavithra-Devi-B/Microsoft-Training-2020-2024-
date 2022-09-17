import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for(int index = 1 ; index < N ; index++){
		    sum += index;
		}
		System.out.println("Sum of N Numbers is "+sum);
	}
}
