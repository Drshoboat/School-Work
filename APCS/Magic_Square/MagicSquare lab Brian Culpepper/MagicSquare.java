//© A+ Computer Science  -  www.apluscompsci.com
//Name -Brian Culpepper 
//Date -2/6/2018
//Class -8TH   
//Lab  -MagicSquare

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
      int[][] magicSquare = new int[1][1];

	}

	public MagicSquare(int size)
	{
      magicSquare = new int[size][size];
	}

	public void setSize(int size)
	{
      magicSquare = new int[size][size];
	}

	public void createMagic()
	{
		int num = 1;
		magicSquare[0][magicSquare.length/2]= num;
      int col = magicSquare.length/2;
      int row = 0;
      for(num =2;num <(magicSquare.length)*(magicSquare.length);num++)
      {
         row --; 
         col ++;
         if(row < 0)//if out of bounds
         {
            row = magicSquare.length-1; 
         }
         if(col>=magicSquare.length)//if out of bounds
         {
            col = 0;
         }
        
         if(magicSquare[row][col] != 0) //if spot is filled
         {
            row ++;
            col--;
            if(row>magicSquare.length || col < 0)//check if out of bounds
            {
               row = 0;   
               col = magicSquare.length-1;
            }
            row++;
         }
         magicSquare[row][col] = num; 
      }
        
	}

	public boolean checkMagic()
	{
		boolean isMagic = true;
      int sum1 = 0;
      int sum2 = 0;
      for(int i =0; i < magicSquare.length; i++)// adding + checking rows
      {
         sum1 = sum1+ magicSquare[0][i];
         for( int j = 1; j< magicSquare.length; j++)
         {
                   
            sum2 = sum2 + magicSquare[j][i];
            if(sum1 != sum2)
            {
               isMagic = false;
            }
            sum2 = sum1;
            
         }
         
      }
       int sum3 = 0;
       int sum4 = 0;  
      
      for(int i = 0; i < magicSquare.length;i++)// adding + checking columns
      {
         sum3 = sum3 + magicSquare[i][0];
         for(int j = 1; j<magicSquare.length;j++)
         {
            
            sum4 = sum4 + magicSquare[i][j];
            if(sum3 != sum4)
            {
               isMagic = false;
            }
            if(sum3 != sum1)
            {
               isMagic = false;
            }
            sum4= sum3;
         }
    
      }
       int sum5 = 0;
       int sum6 = 0;
      for(int i = 0; i <magicSquare.length-1;i++)// adding + checking diagonals
      {
        sum5= sum5 + magicSquare[i][i+1];
        for(int j = magicSquare.length-1; j<magicSquare.length;j++)
        {
            
            sum6 = sum6+ magicSquare[i][i+1];
           if(sum5 != sum6)
            {
               isMagic = false;
            }
            if(sum5!= sum3)
            {
               isMagic = false;
            }
           
        }
         
      
      }
		return isMagic;
	}

	public String toString()
	{ 
   //int [][] magicSquare = new int[4][4];   
    String output=""; 
    for(int a = 0; a<magicSquare.length; a++)
      {
         for (int b =0; b<magicSquare[0].length; b++)
         {
            output += magicSquare[a][b];
            int save=4;
            int number = magicSquare[a][b];
            while(save>=0)
            {
               number =number/10;
               if(number ==0)
               {
                  output+=" ";
                  
                }
               save--;
            }
            output += "\n";
         }
         return output;
      }        
     
           
		return output;
	}
   public void PrintArray()
   {
      System.out.println(toString( ));
   }
}

