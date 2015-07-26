package ch.ithings.coding;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author tpham
 */
public class Task1 {

    public static final int[] A = {1, 4, 3, 3, 1, 2};

    public static void main(String args[]) {
        Task1 task1 = new Task1();
        task1.solution(A);
    }

    public int solution(int[] A) {
        
        if (A.length == 0)
            return -1;
      
        Set<Integer> uniques = new LinkedHashSet <>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int i : A) {
            if (!uniques.add(i)) {
                duplicates.add(i);
            }
        }
        System.out.println("Uniques: "+uniques);
        System.out.println("Duplicates: "+duplicates);
        
        uniques.removeAll(duplicates);
        System.out.println("Uniques without duplicates: "+uniques);
                
        if (uniques.isEmpty()) {
            System.out.println("Return: -1");
           return -1;
        } else {
            System.out.println("Return: "+uniques.toArray()[0]);
            return (int) uniques.toArray()[0];
        }
    }
    
}
