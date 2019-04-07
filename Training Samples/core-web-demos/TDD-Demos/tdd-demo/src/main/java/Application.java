import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//
//{1,2,2,1} {2,2}
//
//[2]
		
public class Application {
	public static void main(String[] args) {
		int[] array1 = {1,2,2,1};
		int[] array2 = {2,2};
		Integer[] intersetArray = intersectArrays(array1, array2);
		System.out.println(Arrays.toString(intersetArray));
	}
	
	public static Integer[] intersectArrays(int[] firstArray,int[] secondArray) {
		Set<Integer> intersectResult = new HashSet<Integer>();
		
		for(int firstArrayIndex = 0 ; firstArrayIndex < firstArray.length ; firstArrayIndex++) {
			for(int secondArrayIndex = 0 ; secondArrayIndex < secondArray.length; secondArrayIndex++) {
				if(firstArray[firstArrayIndex] == secondArray[secondArrayIndex]) {
					intersectResult.add(firstArray[firstArrayIndex]);
				}
			}
		}
		
		return intersectResult.toArray(new Integer[0]);
	}
}
