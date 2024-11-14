package Oct.CollectionFramework3_04110224;

public class LabGenerics2 {
    public static void main(String[] args) {
        temp(12);
        temp(true);
        temp("Pramod");
        // T - Ref - It can be anything.

    }

    public static <T> void temp(T a) {
        System.out.println(a);
    }
    }

