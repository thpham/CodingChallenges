package ch.ithings.coding;

/**
 *
 * @author tpham
 */
public class Task3 {
    
    public static final int[] A = {1, 8, -3, 0, 1, 3, -2, 4, 5};
    
    public static void main(String args[]) {
        Task3 task3 = new Task3();
        task3.solution(6, A);
    }
    
    public int solution(int K, int[] A) {
        
        if (A.length == 0)
            return -1;
        
        int complPairs = 0;
        
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                //System.out.print("("+i+","+j+")=");
                //System.out.print(A[i]+"+"+A[j]);
                //System.out.println("="+(A[i]+A[j]));
                if (A[i] + A[j] == K){
                    complPairs = complPairs+1;
                }
            }
        }
        
        System.out.println("Complementary Pairs: " + complPairs);
        return complPairs;
    }
    
}
