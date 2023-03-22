import java.util.Scanner;

public class Bai_22 {
    public static void isPalindrome(String str) {
        int j = str.length() / 2;
        String rev = "";
        String subString = "";
        for (int i = str.length() / 2 - 1; i >= 0; i--, j++) {
            rev += str.charAt(i);
            subString = subString + str.charAt(j);
            boolean check = subString.equals(rev);
            if (check == false) {
                break;
            }
        }
        System.out.println("output: " + rev.substring(0, rev.length() - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String nhap = in.nextLine();
        isPalindrome(nhap);
    }

}
