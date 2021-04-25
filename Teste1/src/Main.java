import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int givenSum = sc.nextInt();
		int[] a = new int[] { -2, 1, -1, 4, -4, 3, 5};

		// boundaries of slice
		int left = 0; // defines position of slice
		int right = 0; // exclusive
		int currentSum = 0;

		while (right < a.length) {

			if (currentSum < givenSum) { // sum is not enough, add from the right
				currentSum += a[right];
				right++;
			}

			if (currentSum > givenSum) { // sum exceeds given, remove from the left
				currentSum -= a[left];
				left++;
			}

			if (currentSum == givenSum) { // boundaries of given sum found, print it
				System.out.println(Arrays.toString(Arrays.copyOfRange(a, left, right)));
				// remove the left element, so we can process next sums
				currentSum -= a[left];
				left++;
			}
		}
		sc.close();
	}

}
