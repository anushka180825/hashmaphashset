import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basicset{
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
      set.add(20);
        set.add(100);
        set.add(10);
        set.add(-5);
        set.add(80);
        set.add(200);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.contains(5));
        set.remove(80);
        System.out.println(set);


    }
    }
