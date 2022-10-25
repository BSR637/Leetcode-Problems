package com.wissen.LeetcodeProblems;

public class FirstOccurenceInAString {
	
	public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        int length1 = haystack.length(), length2 = needle.length();
        while(i<length1 && j < length2)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;   
            }
            else
            {
                i=i-j+1;
                j=0;
            }
        }
        if(j == length2)
            return i-j;
        else return -1;   
    }

}
