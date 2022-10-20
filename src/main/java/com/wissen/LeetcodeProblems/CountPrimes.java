package com.wissen.LeetcodeProblems;

public class CountPrimes {
	
	 public int countPrimes(int n) {
	        if(n==0 || n==1 || n==2)
	            return 0;
	        int count = 0;
	        boolean[] isPrime = new boolean[n+1];
	        for(int i=0; i<n+1; i++)
	        {
	            isPrime[i] = true;
	        }
	        for(int i=2; i*i <= n; i++)
	        {
	            if(isPrime[i] == true)
	            {
	                for(int j = i*i; j<=n ; j = j+i)
	                    isPrime[j] = false;
	            }
	            
	        }
	        for(int i=2;i<n;i++)
	        {
	            if(isPrime[i] == true)
	                count++;
	        }
	        return count;
	       
	        
	    }

}
