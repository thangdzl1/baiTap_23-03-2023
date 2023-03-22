import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bai_19 {
	public static void menu() {
		System.out.println("1.Giai phuong trinh bac 1");
		System.out.println("2.Giai phuong trinh bac 2");
		System.out.println("0.Thoat");
		System.out.print("Vui long chon: ");
	}

	public static void Giai_Phuong_Trinh_Bac_1(Scanner in) {
		DecimalFormat fixed = new DecimalFormat("##.00");
		System.out.println("nhap vao he so tu do lan luot: ");
		int a = Integer.parseInt(in.nextLine());
		int b = Integer.parseInt(in.nextLine());
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh nay co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			float nghiem = (float) -b / a;
			System.out.println("Phuong trinh co nghiem : x = " + fixed.format(nghiem) + ".");
		}
	}

	public static void Giai_phuong_trinh_bac_2(Scanner in) {
		DecimalFormat fixed = new DecimalFormat("##.00");
		System.out.println("nhap vao he so tu do lan luot: ");
		int a = Integer.parseInt(in.nextLine());
		int b = Integer.parseInt(in.nextLine());
		int c = Integer.parseInt(in.nextLine());
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co nghiem: " + "x = " + fixed.format(-c / b));
			}
			return;
		}
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + fixed.format(x1) + " va x2 = " + fixed.format(x2));
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + fixed.format(x1));
		} else {
			System.out.println("Phuong trinh vo nghiem !");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while (check) {
			menu();
			int nhap = Integer.parseInt(in.nextLine());
			switch (nhap) {
			case 0:
				check = false;
				break;
			case 1:
				Giai_Phuong_Trinh_Bac_1(in);
				break;
			case 2:
				Giai_phuong_trinh_bac_2(in);
				break;
			default:
				System.out.println("vui long chon lai !");

			}
		}
	}

}
