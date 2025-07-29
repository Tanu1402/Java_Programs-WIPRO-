import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = num; 
        int r = 0;
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + r);
    }
}
