import java.util.Scanner;

public class Bai_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao lan luot 2 so: ");
		int firstNum = Integer.parseInt(in.nextLine());
		int secondNum = Integer.parseInt(in.nextLine());
		int count = 0;
		if (firstNum / 10 == secondNum % 10 || firstNum / 10 == secondNum / 10)
			System.out.println("TRUE");
		else if (firstNum % 10 == secondNum % 10 || firstNum % 10 == secondNum / 10)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
