package sorting;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Enter a number to define the length of array");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] num = new int [x];
		
		for(int i = 0; i<x; i++) {
			num[i]=scan.nextInt();
		}
		
		for(int i = 0; i<x; i++) {			
			for(int j = i; j<x; j++) {
				if(num[i]>num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i = 0; i<x; i++) {
			System.out.print(num[i]+" ");
		}
		
		scan.close();

	}

}
