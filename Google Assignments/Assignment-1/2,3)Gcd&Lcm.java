import java.util.*;
public class Main
{
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return gcd(y,x%y);
        }
    }
    static int lcm(int x, int y, int gcdnumber){
        return Math.abs(x*y)/gcd;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		int gcdnumber = gcd(x, y);
		System.out.println("GCD of two numbers is"+gcdnumber);
		System.out.println("LCM of two numbers is"+lcm(x, y, gcdnumber));
	}
}
