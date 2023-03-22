import java.util.Scanner;

public class Bai_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao toa do cua A lan luot la x, y: ");
		int xA = Integer.parseInt(in.nextLine());
		int yA = Integer.parseInt(in.nextLine());

		System.out.println("nhap vao toa do cua B lan luot la x, y: ");
		int xB = Integer.parseInt(in.nextLine());
		int yB = Integer.parseInt(in.nextLine());
		System.out.println("Do dai cua AB la: "+Math.sqrt((xA-xB)*(xA-xB)+(yA-yB)*(yA-yB)));
	}
}
