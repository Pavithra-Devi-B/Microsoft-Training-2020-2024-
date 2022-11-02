class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        while(true){
            int sum=0;
            while(n!=0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        if(sum/10==0){
            if(sum==1||sum==7) return true;
            else return false;
        }
            n=sum;
        }
    }
}

