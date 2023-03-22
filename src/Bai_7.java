import java.util.Scanner;

public class Bai_7 {
	public static void xuLy(Scanner in) {
		System.out.println("nhap n: ");
		int n = Integer.parseInt(in.nextLine());
		System.out.println("cac uoc cua n: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		xuLy(in);
	}

}
