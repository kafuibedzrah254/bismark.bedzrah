class Solution{
    public int[][] min_max_pair(int[] nums, int p){
        int[] differences = new int[nums.length - 1];
        int[][] pairs = new int[nums.length][2];
        int[] minMax = new int[p];
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j< nums.length; j++ ){
                int k = 0;
                int l = 1;
                pairs[i][k] = nums[i];
                pairs[i][l] = nums[i + 1];
                differences[i] = Math.abs(nums[i] - nums[j]);
            }
        }
        for(int m = 0; m < p; m++){
            minMax[m] = differences[m];
}
        minMax = min
        }
        return pairs;
    }

    }
