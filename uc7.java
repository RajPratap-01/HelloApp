public class uc7 {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma
            String result = String.join(", ", args);

            // Final output
            System.out.println("Hello " + result);
        }
    }
}