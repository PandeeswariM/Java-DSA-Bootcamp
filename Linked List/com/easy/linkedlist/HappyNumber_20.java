package com.easy.linkedlist;

public class HappyNumber_20 {
	public int sq(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
       int slow=n;
        int fast=n;
        do{
            slow=sq(n);
            fast=sq(slow);
            
        }while(slow!=fast);
        
        if(slow==1)
            return true;
        
        return false;
    }
}
