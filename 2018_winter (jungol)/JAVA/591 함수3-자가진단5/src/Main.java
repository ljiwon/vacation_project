import java.util.Scanner;

public class Main {
	static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println(funtion(n));
	}

	public static int funtion(int n) {
		if(n == 1)
			return 1;
		return funtion(n / 2) + funtion(n - 1);
	}
}
