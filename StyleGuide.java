import java.util.Arrays;

// imports at the top
public class StyleGuide {

    // spaces over tabs

    // public constants
    public static final int FRIENDLY_NUMBER = 800;

    // private constants
    private static final int MAGIC_NUMBER = 200;

    public static void main(String[] args) {

        // camelcase variable names
        // try to default where sensible
        String input = getFirstArgOrDefault(args, "0");

        int inputAsInt;
        try {
            inputAsInt = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            // AVOID: Naming exceptions 'e'
            // AVOID: Silently failing
            // DO: Fallback to defaults where possible
            inputAsInt = 0;
        }

        int biggestNum = Math.max(FRIENDLY_NUMBER, inputAsInt);

        int result = performSpecialCalculation(biggestNum);

        System.out.println("Result " + result);
    }

    private static String getFirstArgOrDefault(String[] args, String defaultValue) {
        return Arrays.stream(args).findFirst().orElse(defaultValue);
    }

    private static int performSpecialCalculation(int input) {
        return input + MAGIC_NUMBER;
    }
}
