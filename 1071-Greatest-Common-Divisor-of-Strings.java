class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int s,l;
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        if (str1.length()>str2.length()){
            s=str2.length();
            l=str1.length();
        }
        
        else{
            s=str2.length();
            l=str1.length();
        }

        s=gcd(s,l);
        
        return (str1.substring(0,s));
    }

    private static int gcd (int s, int l){
        if (l%s==0){
            return s;
        }
        else{
        return gcd (l%s, s);
        }
    }
}