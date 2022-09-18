import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextInt();
		}
		double mean;
		int sum = 0;
		for(int i = 0 ; i < N ; i++){
		    sum += arr[i];
		}
		mean = (double)sum/(double)N;
		double median;
		Arrays.sort(arr);
		if(N%2 != 0){
		    median = (double)arr[N/2];
		}
		median = (double)(arr[(N - 1) / 2] + arr[N / 2]) / 2.0;
		System.out.println("The mean is "+mean);
    System.out.println("The median is "+median);
	}
}
