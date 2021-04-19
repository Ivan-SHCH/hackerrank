package _2DArrayDS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int rows = arr.length;
		int colum = arr[0].length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < rows -2; i++) {
			for (int j = 0; j < colum -2; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						 +arr[i + 2][j + 1] + arr[i + 2][j + 2];
				max = Math.max(max, sum);

			}
		}
		System.out.println(sum);
		return max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("1.txt"));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
