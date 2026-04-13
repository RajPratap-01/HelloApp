public class uc4 {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i]);
            }
        }
    }
}