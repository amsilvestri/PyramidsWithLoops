/*
 * Aaron Silvestri
 * silvesam@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
    to get code back to remote repo ( edit code first) right click on project->team-> commit
*/
package main;

public class Main {

	public static void main(String[] args) {
		
		int n = 5; int rownum;// setting the number of rows
		for(int i=0; i<n; i++)//outer loop
		{
			for (int j=n-i; j>1; j--)// this for loop is for the rows(inner loop)
			{
				System.out.print(" ");//this prints the spaces at the beginning of each row
			}
			rownum =i+1; {System.out.print(rownum);}// printing each number per row
			
			
			for (int j=1; j<=i; j++ ) //this for loop is for the columns (inner loop)
			{ 
				System.out.print(rownum + "" +  rownum);// this command prints the numbers
			}
			System.out.println(); //this creates a new line of numbers after each row
		}
         	
		
	}
		    
}
