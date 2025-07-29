public class TwoStringasInput {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please pass exactly two arguments in the command line.");
        } else {
            System.out.println(args[0] + " Technologies " + args[1]);
        }
    }
}
