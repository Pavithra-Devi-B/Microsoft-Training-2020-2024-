import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = N ; i >= 1 ; i--){
		    for(int j = i ; j >= 1 ; j--){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
