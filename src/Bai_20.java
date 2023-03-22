import java.util.Scanner;

public class Bai_20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so phan tu: ");
		int soPT = Integer.parseInt(in.nextLine());
		int arr[] = new int[soPT];
		System.out.println("nhap tung phan tu:");
		for (int i = 0; i < soPT; i++) {
			arr[i] = Integer.parseInt(in.nextLine());
		}
		int mangChan[] = new int[soPT];
		int mangLe[] = new int[soPT];
		int indexChan = 0, indexLe = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				mangChan[indexChan] = arr[i];
				indexChan++;
			}
			if (arr[i] % 2 != 0) {
				mangLe[indexLe] = arr[i];
				indexLe++;
			}
		}
		System.out.println("mang chan:");
		for (int i = 0; i < indexChan; i++) {
			System.out.print(mangChan[i]+" ");
		}
		System.out.println("\nmang le:");
		for (int i = 0; i < indexLe; i++) {
			System.out.print(mangLe[i]+" ");
		}
	}

}
