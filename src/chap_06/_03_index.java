package chap_06;
import java.util.Arrays;

public class _03_index {

	public static void main(String[] args) {
		int[] results = {10, 20, 30, 40, 50};
		int target = 30;
		int index = Arrays.binarySearch(results, target);
		System.out.println("Index of " + target + ": " +
		index);
	}

}
