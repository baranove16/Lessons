package Lesson2;

import java.util.Arrays;


public class OddOccurrencesInArray {
    public static int solution(int[] A){
    Arrays.sort(A);
    if (A[0] != A[1]) return A[0];
    if(A.length==1){return A[0];}
    for ( int i = 1; i < A.length; i++ )
    {
        if(i+1<A.length){if (A[i] == A[i+1]) continue;}
        if (A[i] == A[i-1]) continue;
        return A[i];
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,3,9,9,3,4,4,0,0,7,5,6,6,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,5,6};
        System.out.println(solution(A));
    }
}