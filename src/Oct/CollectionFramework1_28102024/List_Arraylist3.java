package Oct.CollectionFramework1_28102024;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List_Arraylist3 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);
        //  Sorting
        //Collections.sort(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
