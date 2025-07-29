public class CaseConverter {
    public static void main(String[] args) {
        char ch = 'a';
if (Character.isLowerCase(ch)) {
    System.out.println(ch + "->" + Character.toUpperCase(ch));
} else if (Character.isUpperCase(ch)) {
    System.out.println(ch + "->" + Character.toLowerCase(ch));
} else {
    System.out.println("Invalid input. Please enter an alphabet character.");
}

    }
}
