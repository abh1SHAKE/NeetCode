class Solution {
    public boolean isAnagram(String string1, String string2) {
        int[] hash=new int[26];

        // Increment frequency of characters
        // present in string1
        for(char c: string1.toCharArray()){
            hash[c-'a']++;
        }
        // Decrement frequency of characters
        // present in string2
        for(char c: string2.toCharArray()){
            hash[c-'a']--;
        }

        // If frequency of any characters is
        // not zero then strings aren't anagram
        for(int i=0;i<26;i++){
            if(hash[i]!=0) return false;
        }
        return true;
    }
}
