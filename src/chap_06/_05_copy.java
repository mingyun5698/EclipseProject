package chap_06;
import java.util.Arrays;

public class _05_copy {

	public static void main(String[] args) {
		int[] results = {10, 20, 30, 40, 50};
		int[] copiedResults = Arrays.copyOf(results,
		results.length);
		System.out.println(Arrays.toString(copiedResults));
		
		int[] originalArray = {10, 20, 30, 40, 50};
		int newLength = 7;
		int[] resizedArray = Arrays.copyOf(originalArray, newLength);
		System.out.println("Original array: " + Arrays.toString(originalArray));
		System.out.println("Resized array: " + Arrays.toString(resizedArray));
	}
}
