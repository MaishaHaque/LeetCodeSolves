class Solution {
    public static String mergeAlternately(String word1, String word2) {
    
    StringBuilder merged= new StringBuilder();
    int i=0;
    while ((i<word1.length()) && (i<word2.length())){
        merged.append(word1.charAt(i));
        merged.append(word2.charAt(i));
        i++;
    } 
    if (word1.length()>word2.length()){
        for (int j=i; j<word1.length();j++){
            merged.append(word1.charAt(j));
        }
    }
    else{
        for (int j=i; j<word2.length();j++){
            merged.append(word2.charAt(j));
        }
    }
    return merged.toString();

    }

}