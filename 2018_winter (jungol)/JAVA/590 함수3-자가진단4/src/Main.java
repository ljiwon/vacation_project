import java.util.Scanner;

public class Main {
	static int n;
	static int[] array;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = 1;
		}
		funtion();
	}

	public static void funtion() {
//		for (int i = 6; i > 0 ; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(array[j] + " ");
//				array[n - 1 ]++;
//				if (array[n - 1] == 6) {
//					array[n - 2]++;
//					array[n - 1] = array[n - 2];
//				}
//			}
//			
//			System.out.println();
//			
//		}
		int a = 1;
		for (int i = 6; i > 0; i--) {
			for (int j = a; j <= 6; j++) {
				array[n - 1] = j;
				for (int k = 0; k < n; k++) {
					System.out.print(array[k] + " ");
				}
				System.out.println();
			}
			array[n - 2]++;
			a++;
//			if (array[0] == 6) {
//				break;
//			} else {
//				array[n - 1]++;
//				a++;
//			}
		}
	}
}
