import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner x = new  Scanner(System.in);
        int n= x.nextInt();
        ArrayList<Integer> List_name= new ArrayList<>();
        List_name.add(n);

        System.out.println("listname: "+ List_name.get(0));
        System.out.println(n);
        //Car and inhertance
        Vheicle BMW = new Car();
        System.out.println(BMW.Run());


    }
}