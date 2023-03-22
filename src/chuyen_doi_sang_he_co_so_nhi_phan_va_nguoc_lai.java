import java.util.Scanner;

public class chuyen_doi_sang_he_co_so_nhi_phan_va_nguoc_lai {
	public static int toBinary(int decimal) {
		if (decimal == 1)
			return 1;
		else
			return decimal % 2 + 10 * toBinary(decimal / 2);
	}

	public static int toBase10(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}

	public static void menu() {
		System.out.println("1. Doi sang he Nhi Phan");
		System.out.println("2. Doi sang he Co So 10");
		System.out.print("Vui long chon :");
	}

	public static void main(String[] args) {
		int nhap, chon;
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so can chuyen doi: ");
		nhap = Integer.parseInt(in.nextLine());
		menu();
		chon = Integer.parseInt(in.nextLine());
		switch (chon) {
		case 1:
			System.out.println(toBinary(nhap));
			break;
		case 2:
			System.out.println(toBase10(nhap));
			break;
		default:
			System.out.println("vui long nhap dung!");
			break;
		}
	}
}
