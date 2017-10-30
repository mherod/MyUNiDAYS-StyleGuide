// imports at the top
public class StyleGuide {

    // spaces over tabs

    public static void main(String[] args) {

        // camelcase variable names
        int biggestNum = Math.max(200, 300);

        int result = performSpecialCalculation(biggestNum);

        System.out.println("Result " + result);
    }

    private static int performSpecialCalculation(int input) {
        return input - 1;
    }
}
