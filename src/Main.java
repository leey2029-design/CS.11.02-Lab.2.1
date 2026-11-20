/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME:
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {


        // 1. add
        int twoSum = add(3, 8);
        System.out.println(twoSum);
        // 2. add
        int fourSum = add(3, 8, 4, 9);
        System.out.println(fourSum);
        // 3. morningGreeting
        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);
        // 4. afternoonGreeting
        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);
        // 5. triple
        String tripled = triple("oohbaby");
        System.out.println(tripled);
        // 6. half
        double halvedEven = half(8);
        System.out.println(halvedEven);

        double halvedOdd = half(17);
        System.out.println(halvedOdd);
        // 7. roundPositiveValueToNearestInteger
        int roundedPosUp = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPosUp);

        int roundedPosDown = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPosDown);
        // 8. roundNegativeValueToNearestInteger
        int roundedNegDown = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegDown);

        int roundedNegUp = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegUp);
    }
    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int sumFirstPair = add(firstNumber, secondNumber);
        int sumSecondPair = add(thirdNumber, fourthNumber);
        return add(sumFirstPair, sumSecondPair);
    }

     static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    static String triple(String text) {
        return text + text + text;
    }

    static double half(int number) {
        return number / 2.0;
    }

    static int roundPositiveValueToNearestInteger(double value) {
        return (int) (value + 0.5);
    }

    static int roundNegativeValueToNearestInteger(double value) {
        return (int) (value - 0.5);
    }
}