import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class TwoSum {
    public List<Integer> twoSum(int[]nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int com = target - nums[i];
            if(map.containsKey(com)){
                ans.add(nums[i]);
                ans.add(com);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;

        List<Integer> ans = solution.twoSum(nums, target);
        System.out.println(ans);
    }
}
