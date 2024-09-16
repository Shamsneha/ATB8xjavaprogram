package sept.ex_13092024;

public class Lab015 {
    public static void main(String[] args) {
        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Neha"+ new_line +  "Shams");
        // System.out.println("Neha"+ '\n' +  "shams");
        System.out.println("Neha"+ tab_line +  "Shams");
        System.out.println("Neha"+ back_space +  "Shams");
        System.out.println("Neha"+ car_r +  "Shams");

        char c11  = '\u1F60'; //65 - ASCII
        // chinese - india, japense -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)

    }
}
