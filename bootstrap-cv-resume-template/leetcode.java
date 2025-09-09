import java.util.*;
class Solution{
    public int[][] min_max_pair(int[] nums, int p){
        int[] differences;
        int[][] pairs = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j< nums.length; j++ ){
                int k = 0;
                int l = 1;
                pairs[i][k] = nums[i];
                pairs[i][l] = nums[i + 1];









            }
        }
        return pairs;
    }

    }
