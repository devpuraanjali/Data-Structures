package com.devpura.anjali.codingbat;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by anjali on 1/24/15.
 */
public class ArrayQuestions {

    public static void main(String[] args) {
        ArrayQuestions solve = new ArrayQuestions();
        solve.zeroFront(new int[]{1,0,0,1});

    }

    public int[] multiple10(int[] nums) {
        int tenMode = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                tenMode = nums[i];
            } else {
                if (tenMode != -1) {
                    nums[i] = tenMode;
                }
            }
        }

        return nums;

    }

    //1,2,3,4,5,6,4
    public int[] pre4(int[] nums)
    {
       int i =0;
        for( i =0; i < nums.length; i++){
            if(nums[i]==4){
                break;
            }
        }

        return Arrays.copyOfRange(nums,0,i);


    }


    //2,4,1,2
    public int[] post4(int[] nums) {
        int i =0;
        int len = nums.length;
        for( i =0; i < len; i++){
            if(nums[i]==4){
                continue;
            }
        }


  return Arrays.copyOfRange(nums,i,len);


    }

// 1,2,3 (2) --> 1, 3, 3
    public int[] notAlone(int[] nums, int val) {
     for(int i =1; i < nums.length-1; i++){
         if(nums[i]==val){
             if(nums[i-1]!=nums[i] && nums[i+1]!= nums[i]){
                 if(nums[i+1] > nums[i-1]){
                     nums[i]=nums[i+1];
                 }else {
                     if(nums[i-1] > nums[i+1]){
                         nums[i] = nums[i-1];
                     }
                 }
             }
         }
     }
return nums;


    }


    public int[] zeroFront(int[] nums) {

        int zeroindex = 0;
        for( int i = 0; i< nums.length ; i++) {
            if(nums[i] == 0) {
                int temp = nums[zeroindex];
                nums[zeroindex] = nums[i];
                nums[i] = temp;
                zeroindex ++;
            }
        }

        return nums;
    }


   // 1,2,10,10,10,4

    public int[] withoutTen(int[] nums) {

        int [] res = new int[nums.length];
        int resIndex = 0;
        for( int i=0; i<nums.length; i++) {
            if(nums[i] != 10) {
                res[resIndex] = nums[i];
                resIndex++;
            }
        }


       return res;

    }


    public int[] zeroMax(int[] nums)
    {
        int j, LargestOdd;

        for(int i=0; i<nums.length-1; i++) //loop through
        {
            if((nums[i]) == 0) //if zero. check the all values to the right
            {
                LargestOdd = -1;
                for(j=i+1;j<nums.length; j++)
                {
                    if( nums[j]%2 == 1) //odd
                        if(nums[j] > LargestOdd) // found a lerger odd number.
                            LargestOdd = nums[j];

                    if(LargestOdd !=-1) // if did find an odd number
                        nums[i] = LargestOdd;
                }
            }
        }

        return nums;
    }



}
