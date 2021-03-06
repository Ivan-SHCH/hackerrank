package salesbymatch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Asd {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		Set<Integer> sockPairs = new HashSet<>();
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(!sockPairs.contains(ar[i])) {
				sockPairs.add(ar[i]);
			}else {
				count++;
				sockPairs.remove(ar[i]);
			}
		}
//		Arrays.sort(ar);
//		System.out.println(Arrays.toString(ar));
//		for (int i = 0; i < ar.length; i += 2) {
//			for (int j = i + 1; j < ar.length; j++) {
//
//				if (ar[i] == ar[j]) {
//					count++;
//					break;
//				}
//			}
//		}
		System.out.println(count);
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("1.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
