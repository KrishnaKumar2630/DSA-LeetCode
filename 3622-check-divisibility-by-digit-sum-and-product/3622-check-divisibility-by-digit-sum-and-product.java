class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum =0;
        int pdt =1;
        while(x>0)
        {
            int dig = x%10;
            sum+=dig;
            pdt*=dig;
            x/=10;
        }

        if(n%(sum+pdt)==0)
        {
            return true;
        }
        else 
        return false;
        
    }
}