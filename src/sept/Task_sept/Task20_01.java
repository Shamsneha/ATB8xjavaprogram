package sept.Task_sept;

public class Task20_01 {
    public static void main(String[] args) {
        // By using Ternary Operators max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c
        int a=10;
        int b=20;
        int c=45;
        int max=a>b? a:b;
        System.out.println(max);
       int maxNum= max>c? max:c;
        System.out.println(maxNum);


    }
}
