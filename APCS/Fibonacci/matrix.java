import java.util.*;
 public class matrix
 {
   int[][] mat = new int [4][8];
   for(int r=0;r<mat.length;r++)
   {
      for (int c=0;c<mat[r].length;c++)
      {
         mat[r][c]=r*c+c/2+r*(c+1);
      }
   }
 
 }