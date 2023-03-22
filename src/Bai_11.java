import java.util.Scanner;

public class Bai_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = Integer.parseInt(in.nextLine());
		int result = (int)(Math.log(n) / Math.log(2));
		System.out.print("ket qua :"+result);
	}

}
