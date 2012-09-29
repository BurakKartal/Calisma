import java.util.Arrays;

public class Deneme {

	public static void findMax (int array []){
		int max = array[0];
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		System.out.println("The maximum number in the array is = " + max);
	}

	public static void findMin (int array []){
		int min = array[0];
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		System.out.println("The minimum number in the array is = " + min);
	}

	public static void searchArrayNumber (int array [] , int k){
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == k){
				System.out.println("The searched number is = " + k + " The index number is = " + i);
			}else	
				System.exit(0);
		}

	}

	public static int binarySearch(int[] search, int find) {
		int start, end, midPt;
		start = 0;
		end = search.length;
		while (start <= end) {
			midPt = (start + end) / 2;
			if (search[midPt] == find) {
				return midPt;
			} else if (search[midPt] < find) {
				start = midPt + 1;
			} else {
				end = midPt - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = {10,35,69,84,75,45,65,41};
		Arrays.sort(array);
		findMax(array);
		findMin(array);
		System.out.println(Deneme.binarySearch(array, 25));
		searchArrayNumber(array, 10);


	}

}
