class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i=0 ; i<candies.length; i++){
            int newCandies = candies[i] + extraCandies;
            result.add(checkGreatest (candies, newCandies, i));      
        }
        return result;
    }

    private static boolean checkGreatest (int [] candies, int check, int index){
        boolean flag= true;
        for  (int i =0; i <candies.length; i++ ){
            if (i==index){
                continue;
            }
            else {
                if (candies[i]>check){
                flag=false;
                }
            }
        }
        return flag;
  }
}