package mk;


public class Solution {

    public int[] solution(int N, int[] A) {

        int counters = N;
        int[] myArray = new int[N];

        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && A[i] <= N) {
                myArray[A[i] - 1]++;
            } else if (A[i] == N + 1) {
                int max = findMax(myArray);
                for (int x = 0; x < N; x++) {
                    myArray[x] = max;
                }
            }
        }

        return myArray;
    }

    private int findMax(int[] myArray) {
        int max = 0;
        if (myArray.length == 1) {
            max = myArray[0];
        } else {
            for (int x = 0; x < myArray.length - 1; x++) {
                if (myArray[x] > max) {
                    max = myArray[x];
                }
            }
        }
        return max;
    }
}
