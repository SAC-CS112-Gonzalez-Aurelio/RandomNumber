import java.util.Arrays;

public class Week9Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] intArray;
		
		intArray = new int[6];
		
		intArray[0]=123;
		intArray[1]=456;
		intArray[2]=479;
		intArray[3]=135;
		intArray[4]=246;
		intArray[5]=135;
		
		Arrays.sort(intArray);
		int i;
		for (i=0; i<intArray.length; i++)
		{	System.out.println("Num:" + intArray[i]);
		}
		int sum = 0;
		
		for (int i1 = 0; i1 < intArray.length; i1++){
		      sum = sum + intArray[i1];
		}
		double average = sum/intArray.length;
		System.out.println("average: " + average);
		
	}
}


