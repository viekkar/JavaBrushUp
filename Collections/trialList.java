package Collections;

import java.util.*;

public class trialList {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        String[] names={"aana","Bob","Carol","David","Edna"};
        list.addAll(Arrays.asList(names));

        list.add("Fred");
        list.addAll(Arrays.asList("George","Gary","Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? "+list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? "+list.contains("Gary"));

    }
}
