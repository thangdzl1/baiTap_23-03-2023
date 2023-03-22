import java.util.Scanner;

public class bai_tap_tinh_tien_karaoke {

	public static void main(String[] args) {
		int threeFirstHoursPrice, totalPrice, afterThreeHoursPrice, waterBottles = 0, saleTime, beginTime, endTime;
		int totalTime;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("nhap vao gio bat dau: ");
			beginTime = Integer.parseInt(in.nextLine());
			System.out.println("nhap vao gio ket thuc: ");
			endTime = Integer.parseInt(in.nextLine());
			System.out.println("nhap vao so chai nuoc");
			waterBottles = Integer.parseInt(in.nextLine());
			totalTime = endTime - beginTime;
			if (totalTime > 0)
				break;
			else
				System.out.println("vui long nhap lai!");
		}
		threeFirstHoursPrice = 30000;
		afterThreeHoursPrice = threeFirstHoursPrice * 30 / 100;
		int waterBottlesPrice = 10000;
		if (totalTime <= 3) {
			totalPrice = threeFirstHoursPrice * totalTime + waterBottles * waterBottlesPrice;
		} else {
			totalPrice = threeFirstHoursPrice * 3 + afterThreeHoursPrice * (totalTime - 3)
					+ waterBottles * waterBottlesPrice;
		}
		if (beginTime < 17)
			System.out.println("tong chi phi: " + totalPrice * 80 / 100);
		else
			System.out.println("tong chi phi: " + totalPrice);
	}

}
