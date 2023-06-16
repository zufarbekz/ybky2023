import java.io.*;
import java.util.*;

class Solution {

  static int numOfPathsToDest(int n) {
    int x = 0;
    int y = 0;
    
    return numPath(x,y,n);
    
  }
  
  static int numPath(int x, int y, int n){
    int destX = n-1;
    int destY = n-1;
    //i >= j
    int result = 0;
    
    if(x==destX && y==destY)
      result++;
    else{
      if(x<n && y<n && x>=y){
        result += numPath(x+1, y, n);
      
        result += numPath(x, y+1, n);
      }
    }
    
    return result;
    
  }

  public static void main(String[] args) {
    //System.out.println(numOfPathsToDest(4));

  }

}