package com.example.array.search.revised;

import com.example.array.search.revised.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void bestTest(){

        Solution solution = new Solution();

        assertEquals(3, Solution.search(new int[]{8, 9, 10, 1, 2, 3, 4, 5, 6, 7}, 1));

        assertEquals(4, Solution.search(new int[]{4,5,6,7,0,1,2}, 0));

        assertEquals(6, Solution.search(new int[]{4,5,6,7,0,1,2}, 2));

        assertEquals(-1, Solution.search(new int[]{1}, 0));

        assertEquals(-1, Solution.search(new int[]{}, 0));
    }
}
