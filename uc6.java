public class uc6 {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Build string with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

            // Final output
            System.out.println("Hello " + result);
        }
    }
}