/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Allison
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum2 = add(5,7);
        int sum4 = add(5,7,6,6);
        String morningMsg = morningGreeting("Toby Fox");
        String afternoonMsg = afternoonGreeting("Mac Miller");
        String tripleTimes = triple("oohbaby");
        double halfNum = half(19);
        int roundedPositive1 =  roundPositiveValueToNearestInteger(8.5);
        int roundedPositive2 =  roundPositiveValueToNearestInteger(8.49);
        int roundedNegative1 = roundNegativeValueToNearestInteger(-8.49);
        int roundedNegative2 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(sum2);
        System.out.println(sum4);
        System.out.println(morningMsg);
        System.out.println(afternoonMsg);
        System.out.println(tripleTimes);
        System.out.println(halfNum);
        System.out.println(roundedPositive1);
        System.out.println(roundedPositive2);
        System.out.println(roundedNegative1);
        System.out.println(roundedNegative2);


    }

    // 1. add
    public static int add(int a,int b){
        return a + b;
    }
    
    // 2. add
    public static int add(int a,int b, int c, int d){
        int ab = add(a,b);
        int cd = add(c,d);
        return add(ab,cd);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好,"+name+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, "+name+"!";
    }

    // 5. triple
    public static String triple(String input) {
        return input+input+input;
    }

    // 6. half
    public static double half(int number) {
        return (double)(number)/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(Double num) {
        return (int)(num+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(Double num) {
        return (int)(num-0.5);
    }

}
