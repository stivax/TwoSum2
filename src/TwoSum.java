import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {4, 2, 3, 6, 1, 4, 7};
        int target = 8;

        twoSum(nums, target);

    }

    private static void twoSum(int[] nums, int target) {
        int[] pairElements;
        int numberTargets = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    pairElements = new int[]{i, j};
                    numberTargets++;
                    System.out.print(Arrays.toString(pairElements));
                }

            }
        }
        System.out.println('\n'+"numberTargets = " + numberTargets);
    }
}
