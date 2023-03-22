import java.util.Scanner;

public class Bai_8 {
	public static final String capitalize(String str) {
		if (str == null || str.length() == 0)
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("nhap vao so phan tu cua mang: ");
		int number0fElement = Integer.parseInt(in.nextLine());
		String arr[] = new String[number0fElement];
		System.out.println("nhap cac phan tu:");
		for (int i = 0; i < number0fElement; i++) {
			String temp = in.nextLine();
			arr[i] = capitalize(temp);
		}
		for (String pt : arr) {
			System.out.println(pt);
		}
	}
}
