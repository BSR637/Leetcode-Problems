package com.wissen.LeetcodeProblems;

import org.junit.Test;

public class ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        	return false;
        int NUMBER_OF_ALPHABETS = 26;
        int[] alphabetCount = new int[NUMBER_OF_ALPHABETS];
        for(int index = 0 ; index < s.length(); index++)
        {
            alphabetCount[s.charAt(index)-'a']++;
            alphabetCount[t.charAt(index)-'a']--;
        }
        for(int index = 0; index < NUMBER_OF_ALPHABETS ; index++)
        {
            if(alphabetCount[index] != 0)
            	return false;
        }

        return true;
        
    }

}
