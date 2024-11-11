import java.util.*;

//********************************************************************
//  PascalsTriangle.java       Java Foundations
//
//  Jimmy Pham T00629354
//  COMP 1131 Assignment 5 Question 3
//********************************************************************
public class PascalsTriangle
{
    
    public static void triangle(int rows)
    {
      int num; 
        for(int i=0; i<rows; i++)  //outer loop for number of rows
      {
         for(int s=rows; s>i; s--) //spacing required to make the triangle
            System.out.print(" ");
             num=1;
         for(int c=0; c<=i; c++)  //inner loop for number of columns 
         {
            System.out.print(num+ " ");
            num = num*(i-c)/(c+1);  //formula for sum of inside numbers
         }
         System.out.print("\n");  //new line for each row
        }
    }
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.println ("Enter a number of rows of Pascal's Triangle: ");
        int rows = scan.nextInt();
        triangle(rows);
        
    }
}
