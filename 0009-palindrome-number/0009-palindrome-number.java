class Solution {
    public boolean isPalindrome(int x) {
        int newnum=0;
        int copy =x;
        while(x>0)
        {
            int dig = x%10;
            newnum = (10*newnum)+dig;
            x/=10;         
                    
        }
        if(copy==newnum)
        {
            return true;
        }
        else 
        return false;
        
    }
}