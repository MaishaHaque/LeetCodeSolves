class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int available = 0;
   
    
    if (flowerbed.length == 1) {
      if (flowerbed [0] == 0){
        available++;
      } 
    }
    
    else if (flowerbed.length == 2) {
      if (flowerbed [0] == 0 && flowerbed [1] == 0){
        available++;
      } 
    }
    else {
      for (int i = 0; i<flowerbed.length; i+=1){

        if (i == 0){
          if (flowerbed [0] == 0 &&  flowerbed [i+1] == 0 ){
            available++;
            flowerbed [i] = 1;
          }
        }
        else if (i == flowerbed.length-1 ){
          if (flowerbed [i] == 0 &&  flowerbed [i-1] == 0){
            available++;
            flowerbed [i] = 1;
          }
        }
        
        else if (flowerbed [i] == 0 &&  flowerbed [i-1] == 0 &&  flowerbed [i+1] == 0) {
          available++;
          flowerbed [i] = 1;
        }
      }
    }
        if (available>= n){
            return true;
        }
        else {
            return false;
        }
    }
}