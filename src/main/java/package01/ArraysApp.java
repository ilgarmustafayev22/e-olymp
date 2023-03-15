package package01;

import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        if (nums[0] >= nums[1] && nums[0] <= nums[2] || nums[0] <= nums[1] && nums[0] >= nums[2]) {
            System.out.println(nums[0]);
        } else if (nums[1] >= nums[0] && nums[1] <= nums[2] || nums[1] <= nums[0] && nums[1] >= nums[2]) {
            System.out.println(nums[1]);
        } else {
            System.out.println(nums[2]);
        }

    }
}
