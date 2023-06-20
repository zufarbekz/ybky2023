import java.io.*;
import java.util.*;

class Solution {

  // i = 1 from 0 to arr1.length
  // TIME COMPLEXITY: M*N
  // SPACE COMPLEXITY: N,M
  // int i, j = 0
  // while ( i < M AND j < N)
  //    if arr1[i] == arr2[j] then duplicates.add(NUMBER)
  //    else arr[i] > arr2[j] then j++
   //  then i++
  
  static int[] findDuplicates(int[] arr1, int[] arr2) {
   
  
    int[] dupl = new int[arr1.length];
    
    int i=0;
    int j=0;
    int n=0;
    
    while(i<arr1.length && j<arr2.length) {
      if(arr1[i] == arr2[j]){
        dupl[n] = arr1[i];
        n++;
      }
      else if(arr1[i] > arr2[j])
        j++;
      else
        i++;
    }

    return dupl;
  }
  public static void main(String[] args) {
  }
}