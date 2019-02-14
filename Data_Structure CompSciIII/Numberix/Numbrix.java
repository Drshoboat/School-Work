/**
 * Numbrix.java  6/11/2011
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 *
 * Solves Numbrix puzzles
 * http://www.parade.com/numbrix
 */

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a Numbrix puzzle.
 */
public class Numbrix
{
	/** The puzzle data */
	private int[][] grid;

	/** Indicates whether numbers are used in the original puzzle
	 *  If the number n is used, then used[n] is true;  Otherwise it's false */
	private boolean[] used;


	/**
	 * Constructs a Numbrix puzzle object.
	 * @param fileName the name of the file containing the puzzle data.
	 * @throws FileNotFoundException when fileName file does not exist.
	 */
	public Numbrix(String fileName) throws FileNotFoundException
    {
			File file = new File(fileName);
			Scanner f = new Scanner(file);

			String rowsAndCols = f.nextLine();
			String[] numRowsandNumCols = rowsAndCols.split(" ");

			int numRows = Integer.valueOf(numRowsandNumCols[0]);
			int numCols = Integer.valueOf(numRowsandNumCols[1]);

			grid = new int[numRows][numCols];
			used = new boolean[(numRows * numCols) + 1];

			String numbers;
			int[] arrOfNumbers = new int[numRows];
			for(int i = 0; i < numRows; i ++)  {
				numbers = f.nextLine();
				String[] arrOfNums= numbers.split(" ");
				for(int j = 0; j < arrOfNums.length; j++) {
					arrOfNumbers[j] = Integer.parseInt(arrOfNums[j]);

					if(arrOfNumbers[j] ==0) {
						grid[i][j] = 0;

					} else {
					grid[i][j] = arrOfNumbers[j];
					used[arrOfNumbers[j]] = true;
					//System.out.println(Arrays.toString(used));
					//System.out.println(used.length);
					//System.out.println(used[49]);
					//System.out.println(used[1]);
				}
				}
				}

			}

	/**
	 * Finds all solutions to the Numbrix puzzle stored in grid by
	 * calling recursiveSolve for every possible cell in grid that
	 * originally contains a 0 or a 1.  Each of these calls should
	 * attempt to solve the puzzle beginning with the number 1.
	 */
	public void solve()
	{
		for(int i = 0 ; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				recursiveSolve(i,j,1);
			}
		}
	}

	/**
	 * Attempts to solve the Numbrix puzzle by placing n in grid[r][c]
	 * and then makeing recursive calls (up, down, left, and right) to
	 * place n+1 and higher numbers.
	 * @param r the row of the cell in which to place n.
	 * @param c the column of the cell in which to place n.
	 * @param n the number to place in grid[r][c].
	 */
	private void recursiveSolve(int r, int c, int n)
	{

	 //Test code
  	//System.out.println("R: " + r);
	  //System.out.println("C:" + c);
		//System.out.println("N: " + n);



		//base case one
		if(r >= grid.length || r < 0) {
			return;
		} else if(c >= grid[0].length || c < 0) {
			return;
		}

		boolean zero = (grid[r][c] ==0);

		//base case two
		if(zero &&  used[n]) {
			return;
		}

		//base case three
		if(!zero && grid[r][c] != n) {
			return;
		}

		grid[r][c] = n;

		//solved?.... base case four
		if(n == (grid.length * grid[0].length)) {
			System.out.println(this);


		} else {
			recursiveSolve(r, c - 1, n + 1); // up
			recursiveSolve(r, c + 1, n + 1); // down
			recursiveSolve(r - 1, c, n + 1); // left
			recursiveSolve(r + 1, c, n + 1); // down
		}

		if(zero) {
			grid[r][c] = 0;
		}
	}

	/**
	 * Returns a String which represents the puzzle.
	 * @return the puzzle numbers with a tab after each number in a row
	 *         and a new line character after each row.
	 *         '-' characters should replace 0s in the output.
	 */
	public String toString()
	{
		String result = "";
		for(int i = 0; i < grid.length; i ++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 0) {
					result += " - " + " \t";
				}	else {
					result += grid[i][j] + " \t";
				}
			}
			result += "\n";
			//System.out.println();
		}


		return result;
	}
}
