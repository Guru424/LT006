package corejava;

import java.util.ArrayList;

public class MultiArrayToSingleArray {

	public static void main(String[] args) {
		
		int[][] numbers = {{4, 5, 6},{3, 1, 10}, {4, 2, 9}};


		ArrayList<Integer> numbers1Dim = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++)
		{
		    for (int x = 0; x < numbers[i].length; x++)
		    {
		      numbers1Dim.add(numbers[i][x]);
		    }
		}
	}
}
