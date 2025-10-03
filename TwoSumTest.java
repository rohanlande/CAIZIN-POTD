import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum solution = new TwoSum();
    @Test
    public void testStandardCase() {
        int[] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        List<Integer> result = solution.twoSum(nums, target);

        assertEquals(2, result.size());
        assertTrue(result.contains(11));
        assertTrue(result.contains(-1));
    }
    @Test
    public void testNoSolution(){
        int [] nums = {1,2,3};
        int target = 10;
        List <Integer> result = solution.twoSum(nums,target);
    }

}