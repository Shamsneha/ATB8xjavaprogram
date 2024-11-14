package Oct.CollectionFramework2_30102024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class LabCF_SET {
    public static void main(String[] args) {
        // List - > Duplicate Allows
        // Set -> Doesn't allow Duplicate

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("pramod");
        hs.add("dramod");
        System.out.println(hs);

    }
}
