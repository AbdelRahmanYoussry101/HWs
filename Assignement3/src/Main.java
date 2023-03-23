import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        int x = list.get(0);
        for (int i : list) {
            if (x < i) {
                x = i;
            }
        }
        return x;
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(6);
        x.add(5);
        x.add(4);
        x.add(3);
        x.add(2);
        x.add(1);
        sort(x);
    }

}