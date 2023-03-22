import java.util.Scanner;

public class Bai_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
