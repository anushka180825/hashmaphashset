import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        int []arr={4,9,2,6,4,8,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
       HashSet<Integer> set =new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-5);
        set.add(80);
        set.add(200);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        set.clear();
        System.out.println(set);

    }
}
