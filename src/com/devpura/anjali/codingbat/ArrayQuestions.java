package com.devpura.anjali.codingbat;

/**
 * Created by anjali on 1/24/15.
 */
public class ArrayQuestions {

    public int[] multiple10(int[] nums) {
        if(nums == null) {
            throw new RuntimeException("Please pass not null array");
        }
        int tenMode = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 10 == 0)
                tenMode = nums[i];
            else if(tenMode != -1)
                nums[i] = tenMode;
        }
        return nums;
    }
}
