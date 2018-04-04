package mk;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testMaxCounter1() {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int[] b = {3, 2, 2, 4, 2};
        int[] result = solution.solution(5, a);
        assertTrue(Arrays.equals(result, b));
    }

    @Test
    void testMaxCounter2() {
        int[] a = {3, 4};
        int[] b = {0};
        int[] result = solution.solution(1, a);
        assertTrue(Arrays.equals(result, b));
    }

//    @Test
//    void testLowerTape2() {
//        int[] a = {3, 1};
//        int result = solution.solution(a);
//        assertTrue(2 == result);
//    }
//
   @Test
   void testLowerTape3() {
       int[] a = {-5, 1, 7, 4};
       int result = solution.solution(a);
       assertTrue(1 == result);
   }

}
