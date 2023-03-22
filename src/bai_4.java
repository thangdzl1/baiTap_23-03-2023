import java.util.Scanner;

public class bai_4 {
	public static int xuLy(int n) {
		if (n == 0)
			return 0;
		return n%10 + xuLy(n / 10);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = Integer.parseInt(in.nextLine());
		System.out.println(xuLy(n));
	}

}
