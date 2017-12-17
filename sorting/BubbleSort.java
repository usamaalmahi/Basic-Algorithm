package sorting;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();	
	int num[] = new int[x];
		for(int i = 0; i<x; i++) {
			num[i] = scanner.nextInt();			
		}
	
	
	for(int j=0; j<x; j++) {
		for(int k=0; k<(x-1); k++) {
			if(num[k]>num[k+1]) {
				int temp = num[k];
				num[k] = num[k+1];
				num[k+1] = temp;
			}
		}
	}
	
	
	for(int i = 0; i<x; i++) {
		System.out.println(num[i]);				
	}
	scanner.close();
	}
	
}
