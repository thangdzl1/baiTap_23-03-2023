import java.util.Scanner;

public class Bai_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao lan luot dia chi cua kan1 kan2: ");
		int x1 = Integer.parseInt(in.nextLine());
		int x2 = Integer.parseInt(in.nextLine());
		System.out.println("nhap vao lan luot van toc v1 v2 cua kan1 kan2: ");
		int v1 = Integer.parseInt(in.nextLine());
		int v2 = Integer.parseInt(in.nextLine());
		if(v1<=v2) {
			System.out.println("khong gap nhau !");
		}
		if(v1>v2) {
			System.out.println("co gap nhau !");
		}
	}	

}
