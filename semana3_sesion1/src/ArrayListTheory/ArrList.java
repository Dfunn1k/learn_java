package ArrayListTheory;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(19);
        nums.add(22);
        nums.add(17);

//        for (int i = 0; i < nums.size(); i++)
//            System.out.println(nums.get(i));
        System.out.println(nums);

        nums.remove(1);
        System.out.println("Eliminando el indice 1...");
        System.out.println(nums);
    }
}
