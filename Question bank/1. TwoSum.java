public class Solution {
    public int[] twoSum(int[] numbers, int target) {        
            int len = numbers.length;
        int[] result = new int[2] ;
        int num = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            num = numbers[i];
            for(int j = i+1; j < len; j++)
            {
              sum = num+numbers[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }        
        }
        return result;
    }
}
