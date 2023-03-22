package homework;

import java.util.Scanner;

public class SingleElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums=new int[size];
        for(int i =0;i<size;i++){
            nums[i]=scan.nextInt();
        }for(int i=0;i<size;i++){
            if(nums[i]%2==1 || nums[i]%2==-1){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
