import java.util.Scanner;

public class Bai_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao nam: ");
		int year = Integer.parseInt(in.nextLine());
		if(year%4==0 && year%100!=0) {
			System.out.println("la nam nhuan");
		}else {
			System.out.println("khong phai nam nhuan");
		}
		
	}

}
