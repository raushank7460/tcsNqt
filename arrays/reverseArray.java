package arrays;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size");
        int num=sc.nextInt();
        System.out.println("Enter ele:");
        int[]nums=new int[num];
        for(int i=0;i<num;i++){

            nums[i]=sc.nextInt();
        }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
