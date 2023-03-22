import java.util.Scanner;

public class Bai_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao chuoi: ");
		String chuoi = in.nextLine();
		System.out.println("do dai chuoi: " + chuoi.length());
		System.out.println("nhap vao vi tri muon in ra");
		int pos = Integer.parseInt(in.nextLine());
		System.out.println("char o vi tri da chon: " + chuoi.substring(pos - 1, pos));
		boolean check = chuoi.contains("abcdef");
		if (check == false) {
			System.out.println("khong co chuoi phu ");
		} else {
			System.out.println("co chuoi phu");
		}
	}
}
