import java.util.Scanner;

public class Bai_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = Integer.parseInt(in.nextLine());
		int S = 0;
		for (int i = 0; i < n; i++) {
			S += i;
		}
		System.out.println("tong :"+S);
	}

}
