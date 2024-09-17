package sept.ex_16092024;

public class Lab026 {
    public static void main(String[] args) {
        // Relational Operators  = boolean
        //  > < , >= <= , != , ! -> true or false
        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_Kassu = 34;
        int age_Neha = 34;
//        boolean result = age_Neha> age_Kassu; // false
        boolean result = age_Neha >= age_Kassu;
        // false-> age_Neha > age_Kassu; or
        // True -> age_Neha =age_Kassu;
        System.out.println(result);
    }
}
