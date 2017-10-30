import java.util.Arrays;

// imports at the top
public class StyleGuide {

    // spaces over tabs

    // constants first, public then private

    public static final int FRIENDLY_NUMBER = 800;

    private static final int MAGIC_NUMBER = 200;

    // properties after constants
    private String name;

    // public static functions
    public static void main(String[] args) {

        // camelcase variable names
        // try to default where sensible
        String input = Utils.getFirstArgOrDefault(args, "0");

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

        int result = BusinessLogic.performSpecialCalculation(biggestNum);

        System.out.println("Result " + result);

        final StyleGuide styleGuide = new StyleGuide("example");

        String styleGuideName = styleGuide.getName();

        System.out.println("Name " + styleGuideName);
    }

    // constructor after:
    //  - fields
    //  - public static methods (entry points to the class)

    public StyleGuide(String name) {
        this.name = name;
    }

    // declare methods after all field declarations

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // private static functions

    // inner classes, public then private

    public static class Utils {

        static String getFirstArgOrDefault(String[] args, String defaultValue) {
            return Arrays.stream(args).findFirst().orElse(defaultValue);
        }
    }

    private static class BusinessLogic {

        private static int performSpecialCalculation(int input) {
            return input + MAGIC_NUMBER;
        }
    }
}
