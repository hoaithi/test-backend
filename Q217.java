import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Q217
{
    public boolean solutionUsingHashSet(int[] nums) throws Exception {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
       return false;
    }

    public boolean solution(int[] nums) throws Exception {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPalindrome(int x) {
        Integer y = Integer.reverse(x);
        return y.intValue() == x;
    }
}
