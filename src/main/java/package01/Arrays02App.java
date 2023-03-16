package package01;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int sum = 0;
        long prod = 1;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i< nums.length;i++) {

            sum +=nums[i]; ;
            prod *=nums[i] ;
        }
        for(int i = 1; i < nums.length; i ++){
            int curr = nums[i];
            if(min>curr){
                min = curr;
            }if(max<curr){
                max = curr;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(prod);


    }
}