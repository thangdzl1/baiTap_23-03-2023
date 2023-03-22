import java.util.Scanner;

public class Bai_17 {
    final static int MAX = 1000;
    final static int MIN = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rand = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int number = -1;
        while (rand != number) {
            System.out.println("nhap vao so: ");
            number = Integer.parseInt(in.nextLine());
            if (number < rand) System.out.println("So dang nho hon!");
            else if (number > rand) System.out.println("So dang lon hon!");
        }
    }
}
