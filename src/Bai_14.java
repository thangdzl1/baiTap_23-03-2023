import java.util.Scanner;

public class Bai_14 {
	public static int[] deletDuplicateElement(int arr[]) {
		int i, j, k,dem=0;
		int length = arr.length;
		int[] tempArr = new int[arr.length];
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length-1; j++) {
				if (arr[i] == arr[j]) {
					for (k = j; k < length-1; k++) {
						arr[k] = arr[k + 1];
					}
					j--;
					length--;
					dem++;
				}
			}tempArr[i]=arr[i];
		}
		tempArr = new int[arr.length -dem-1];
		System.out.println("cac phan tu moi cua mang: ");
		for (i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		return arr;
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
		deletDuplicateElement(arr);
	}

}
