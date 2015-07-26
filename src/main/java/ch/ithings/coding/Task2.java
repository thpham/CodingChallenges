package ch.ithings.coding;

import java.util.*;

import java.util.LinkedList;

/**
 *
 * @author tpham
 */
public class Task2 {

    public static final int[] A = {2, 3, 1, 1, 3};

    public static void main(String args[]) {
        Task2 task2 = new Task2();
        task2.solution(A);
    }

    public int solution(int[] A) {

        if (A.length == 0) {
            return -1;
        }

        List<Integer> list = new LinkedList<>();
        int pointer = 0;
        int cycle = 0;

        while (cycle == 0) {
            list.add(pointer);
            pointer = A[pointer];
            cycle = getRepeatingCycle(list);
        }

        System.out.println("The list: "+ list);
        System.out.println("Cycle: "+ cycle);

        return cycle;
    }

    private int getRepeatingCycle(List list) {
        // for every position in the array:
        for (int startPos = 0; startPos < list.size(); startPos++) {
        // check if there is a repeating sequence here:

            // check every sequence length which is lower or equal to half the
            // remaining array length: (this is important, otherwise we'll go out of bounds)
            for (int sequenceLength = 1; sequenceLength <= (list.size() - startPos) / 2; sequenceLength++) {

                // check if the sequences of length sequenceLength which start
                // at startPos and (startPos + sequenceLength (the one
                // immediately following it)) are equal:
                boolean sequencesAreEqual = true;
                for (int i = 0; i < sequenceLength; i++) {
                    if (list.get(startPos + i) != list.get(startPos + sequenceLength + i)) {
                        sequencesAreEqual = false;
                        break;
                    }
                }
                if (sequencesAreEqual) {
                    //System.out.println("Found repeating sequence at pos " + startPos);
                    return sequenceLength;
                }
            }
        }
        return 0;
    }

}
