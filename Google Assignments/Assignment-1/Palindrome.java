import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int N = scan.nextInt();
		int originalNo = N;
		int rem, reversedNo = 0;
		while(N > 0){
		    rem= N%10;
		    reversedNo = reversedNo * 10 + rem;
		    N /= 10;
		}
		if(reversedNo == originalNo){
		    System.out.println("The entered number is a palindrome");
		}
		else{
		    System.out.println("The entered number is not a palindrome");
		}
	}
}
