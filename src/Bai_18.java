import java.util.Scanner;

public class Bai_18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao so tien goi: ");
		int moneyIn = Integer.parseInt(in.nextLine());
		System.out.println("nhap vao so tien muon co: ");
		int moneyOut = Integer.parseInt(in.nextLine());
		System.out.println("nhap lai hang nam: ");
		double interest = Double.parseDouble(in.nextLine());
		double interestAmount = 0;
		int yearTakes = 0;
		while (moneyIn < moneyOut) {
			interestAmount = moneyIn * interest / 100;
			moneyIn += interestAmount;
			yearTakes++;
		}
		System.out.println("so nam can: " + yearTakes + " nam");
	}

}
