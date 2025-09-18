/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Allison
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
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
        return "早上好, "+name+"!";
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
    public static int roundPositiveValueToNearestInteger(double num) {
        return (int)(num+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double num) {
        return (int)(num-0.5);
    }

}
