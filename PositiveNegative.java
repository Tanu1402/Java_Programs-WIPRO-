import java.util.Scanner;
public class PositiveNegative{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	if(num1==0) {
		System.out.println("Zero");
	}
	else if(num1>0) {
		System.out.println("Positive number");
	}
	else {
		System.out.println("Negative number");
	}
}
}
