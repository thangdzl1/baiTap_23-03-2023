
public class in_hinh_quoc_ky_My {
	public static void equalSignPart(String Arr[][]) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 50; j++) {
				Arr[i][j] = "=";
			}
		}
	}

	public static void starSignPart(String Arr[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 18; j++) {
				if (j % 2 == 0)
					Arr[i][j] = "*";
				else
					Arr[i][j] = " ";
			}
		}
	}

	public static void printOut(String Arr[][]) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 50; j++) {
				System.out.print(Arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String Arr[][] = new String[12][50];
		equalSignPart(Arr);
		starSignPart(Arr);
		printOut(Arr);
	}
}
