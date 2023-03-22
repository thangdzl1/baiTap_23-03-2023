import java.util.Scanner;

public class Bai_13 {
	public static void average(int arr[]) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("gia tri trung binh: " + sum / arr.length);
	}

	public static void Max_Min(int arr[]) {
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("phan tu lon nhat :" + max);
		System.out.println("phan tu be nhat :" + min);
	}

	public static void Max_Min_Negative(int arr[]) {
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max && arr[i] < 0)
				max = arr[i];
			if (arr[i] < min && arr[i] < 0)
				min = arr[i];
		}
		if (max < 0)
			System.out.println("phan tu am lon nhat:" + max);
		else
			System.out.println("mang khong co phan tu am lon nhat");
		if (min < 0)
			System.out.println("phan tu am be nhat :" + min);
		else
			System.out.println("mang khong co phan tu am be nhat");
	}

	public static void Max_Min_Positive(int arr[]) {
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max && arr[i] > 0)
				max = arr[i];
			if (arr[i] < min && arr[i] > 0)
				min = arr[i];
		}
		if (max > 0)
			System.out.println("phan tu duong lon nhat:" + max);
		else
			System.out.println("mang khong co phan tu duong lon nhat");
		if (min > 0)
			System.out.println("phan tu duong be nhat :" + min);
		else
			System.out.println("mang khong co phan tu duong be nhat");
	}

	public static void even0r0od(int arr[]) {
		System.out.println("phan tu chan: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n phan tu le: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void deletElement(int arr[], Scanner in) {
		System.out.println("nhap index phan tu can xoa: ");
		int nhap = Integer.parseInt(in.nextLine());
		int tempArr[] = new int[arr.length - 1];
		for (int i = nhap - 1; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			tempArr[i] = arr[i];
		}
		System.out.println("cac phan tu moi cua mang: ");
		for (int i = 0; i < tempArr.length; i++) {
			System.out.print(tempArr[i] + " ");
		}
		System.out.println("");
	}

	public static void addElement(int arr[], Scanner in) {
		System.out.println("nhap vi tri phan tu can them: ");
		int nhap = Integer.parseInt(in.nextLine());
		System.out.print("nhap phan tu muon them:");
		int add = Integer.parseInt(in.nextLine());
		int tempArr[] = new int[arr.length + 1];
		for (int i = nhap - 1; i < arr.length; i++) {
			tempArr[i + 1] = arr[i];
		}
		for (int i = 0; i < nhap - 1; i++) {
			tempArr[i] = arr[i];
		}
		tempArr[nhap - 1] = add;
		System.out.println("cac phan tu moi cua mang: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(tempArr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so phan tu: ");
		int number0fElement = Integer.parseInt(in.nextLine());
		int arr[] = new int[number0fElement];
		System.out.println("nhap cac phan tu: ");
		for (int i = 0; i < number0fElement; i++) {
			arr[i] = Integer.parseInt(in.nextLine());
		}
		average(arr);
		Max_Min(arr);
		Max_Min_Negative(arr);
		Max_Min_Positive(arr);
		even0r0od(arr);
		deletElement(arr, in);
		addElement(arr, in);
	}

}
