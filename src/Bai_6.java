import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Bai_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao chuoi: ");
		String chuoi = in.nextLine();
		char arr[] = new char[chuoi.length()];
		arr = chuoi.toCharArray();
		String chuoiMoi = "";
		for (int i = chuoi.length() - 1; i >= 0; i--) {
			chuoiMoi += arr[i];
		}
		System.out.println(chuoiMoi);
	}

}
