package OneDimensionLevel1;

public class ReverseArray {
	public static void main(String[] args) {
		int[] inputArr = {1,2,3,4,5,6};
		reverseTheArray(inputArr);
		for(int i=0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}
	
	public static int[] reverseTheArray(int[] inputArr) {
		int size = inputArr.length;
		// int[] reversedArray = new int[size];
		
		// Using Two Pointers Approach
		// initialization
		int i = 0, j = size-1 ;
		
		while(j > i) {
			int temp = inputArr[i];
			inputArr[i] = inputArr[j];
			inputArr[j] = temp;
			
			i++;
			j--;
		}
		
		return inputArr;
	}
	
}
