package Oct.CollectionFramework1_28102024;
import java.util.ArrayList;
import java.util.Collection;


public class ArrayListCollectionFramework {
    public static void main(String[] args) {
        // Collection - Interface - 10
        // List - Interface - 15 ( 25)
        //  ArrayList, LinkedList, Stack and Vector - Class


        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // Collection of items - with same or different data type.
        // Collections of students -

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);


        // Integer[] names = new Integer[5]; - Fixed, Same Data Types









    }
}
