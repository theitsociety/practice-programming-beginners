package com.company;

public class Solution {



// Author : H Cenik
    public boolean ifCharSeqExistsInString(char[] chars, String s) {

        //s ->  e r r r s g h -> int j
        //chars -> 'r''s''g' -> int i
        //I changed the name of variables because ‘j’ and ‘i’ made me confused while explaining to myself aloud :))
        int stringIndex = 0;
        int charIndex = 0;

        //I preferred to use while loop instead of for loop  because incrementation is more flexible in while loop
        // so our flow is more clear now.
        while(stringIndex < s.length()) {
            if(chars[charIndex] == s.charAt(stringIndex)){
                charIndex++;
                if(charIndex == chars.length)
                    return true;
            }else {
                stringIndex = stringIndex - charIndex;
                charIndex = 0;
            }
            stringIndex++;
        }
        return false;
    }

    // Write a Java program to check whether a given string ends with the contents of another string
    public boolean ifStringEndsWithAnotherString(String s, String e){
        int slength=s.length(), elength=e.length();

        if(elength>slength)
            return false;
        else {
            int back=0;
            while(back<e.length()){
                if(s.charAt(slength-1-back)!=e.charAt(elength-1-back))
                    return false;
                ++back;
            }
            return true;
        }
    }

    public int getLastIndexofCharSeq(char[] chars, String s){
        int stringIndex = s.length()-1;
        int charIndex = chars.length-1;
        while(stringIndex >= 0) {
            if(chars[charIndex] == s.charAt(stringIndex)){
                charIndex--;
                if(charIndex == -1)
                    return stringIndex;
            }else {
                stringIndex = stringIndex + (chars.length - charIndex -1);
                charIndex = chars.length-1;
            }
            stringIndex--;
        }
        return -1;
    }
}
