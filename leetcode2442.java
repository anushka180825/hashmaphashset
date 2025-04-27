import java.sql.SQLOutput;
import java.util.HashSet;

public class leetcode2442 {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-5);
        set.add(80);
        set.add(200);
        System.out.println(set);


    }

    public int countdistinctinteger(int[]nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(reverse(nums[i]));

        }
        return set.size();
    }
    public int reverse(int n){
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
}
