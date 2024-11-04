package sept.ex_23092024;

public class Lab078 {
    public static void main(String[] args) {
        char c = 'A';
        char b = 'C';
        switch (c) {
            case 'A'+1:
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;
//            case 65:
//                System.out.println("65");
//                break;
            case 'A'+2:
                System.out.println("C");
                break;
        }
    }
}
