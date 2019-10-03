public class BinarySearcher {

	private int[] intArray;
	
	public BinarySearcher(int[] arrayInt) {
		this.intArray = arrayInt;
		sort();
		for(int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
	}
	
	public int binarySearch(int toSearch) {
		return binarySearch(toSearch, 0, intArray.length);
	}
	
	public int binarySearch(int toSearch, int firstIndex, int lastIndex) {
		if(lastIndex - firstIndex == 1) {
			System.out.println("\n Integer is not in array.");
			return 4444444;
		}
		if(intArray[(firstIndex+lastIndex)/2] == toSearch) return (firstIndex+lastIndex)/2;
		if(intArray[(firstIndex+lastIndex)/2] > toSearch) return binarySearch(toSearch, (firstIndex+lastIndex)/2, lastIndex);
		if(intArray[(firstIndex+lastIndex)/2] < toSearch) return binarySearch(toSearch, firstIndex, (lastIndex+firstIndex)/2);
		return 4444444;
	}
	
	private void sort() {
		for(int i = 0; i<intArray.length; i++) {
			int maxIntIndex = intArray.length-1;
			for(int j = i; j<intArray.length; j++) {
				if(intArray[j] > intArray[maxIntIndex]) maxIntIndex = j;
			}
			int temp = intArray[i];
			intArray[i] = intArray[maxIntIndex];
			intArray[maxIntIndex] = temp;
		}
	}
}
