class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int count = 0;
        for(int j=0; j < nums.length; j++){
            for(int i= j+1; i < nums.length; i++){            
                if(nums[j] + nums[i] == target){              
                    answer[count] = j;
                    count++;
                    answer[count] = i;
                }
            }
        }        
        return answer;       
    }
}
