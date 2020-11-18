/*
 * 
 * Given two sorted integer arrays nums1 and nums2
 * Merge nums2 into nums1 as one sorted array.
 * 
 */
package practice;
import java.util.Arrays;

public class MergeSortedArray {
	private static int[] mergeSortedArray(int[] nums1, int[] nums2) {
		int[] mergeSortedArray = new int[nums1.length + nums2.length];
		int i = 0, m = 0, n = 0;

		while (i < nums1.length && m < nums2.length) {
			if (nums1[i] < nums2[m]) {
				mergeSortedArray[n] = nums1[i];
				i++;
				n++;
			} else {
				mergeSortedArray[n] = nums2[m];
				m++;
				n++;
			}
		}

		while (i < nums1.length) {
			mergeSortedArray[n] = nums2[i];
			i++;
			n++;
		}
		while (m < nums2.length) {
			mergeSortedArray[n] = nums2[m];
			m++;
			n++;
		}
		return mergeSortedArray;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] {2, 5, 10, 23, 26};
		int[] nums2 = new int[] {-20, -9, 2, 15, 29};
		int[] mergeSortedArray = mergeSortedArray(nums1, nums2);
		System.out.println("Nums 1 array is: " + Arrays.toString(nums1));
		System.out.println("Nums 1 array is: " + Arrays.toString(nums2));
		System.out.println("Merge Sorted array is : " + Arrays.toString(mergeSortedArray));
	}
}