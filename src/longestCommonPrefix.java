/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""
 */

import java.util.Arrays;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        for (int count = 0; count < strs[0].length(); count++) {
            char ch = strs[0].charAt(count);
            for(String s:strs){
                if(s.charAt(count)!=ch)
                    return ans;
            }
            ans += ch;
        }
        return ans;
    }
}
