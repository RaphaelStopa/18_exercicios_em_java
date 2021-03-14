import java.util.HashSet;
import java.util.Set;

//Could have done it by Stream, but streams generally have a slower processing

//Write a function
//
//class Solution { public int solution(int[] A); }
//
//that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.
//
//        Assume that:
//
//        N is an integer within the range [0..100,000]; each element of array A is an integer within the range
//        [−1,000,000..1,000,000]. For example, given array A consisting of six elements such that:
//
//        A[0] = 2    A[1] = 1    A[2] = 1
//        A[3] = 2    A[4] = 3    A[5] = 1
//        the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

public class exer2 {
    public static void main(String[] args) {

        int[] test_two = {1, 2, 3, 3, 2};

        System.out.println(solution(test_two));
    }

    public static int solution(int[] A) {

        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            result.add(A[i]);
        }
        return result.size();
    }
}
