package sorting;
import java.util.Scanner;

public class InsertionSort{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int num[] = new int[x];
			for(int i = 0; i < x; i++) {
				num[i] = sc.nextInt();
			}
		
			
			
		for(int j = 0; j<x; j++) {

			int temp = num[j];
			int k = j-1;
			while(k>=0 && num[k]>num[k+1]) {
				num[k+1] = num[k];
				num[k] = temp;
				k--;
			}
		}
			
			
			
		
		for(int i = 0; i < x; i++) {
			System.out.println(num[i]);
		}
		
		
		
		sc.close();
	}
}