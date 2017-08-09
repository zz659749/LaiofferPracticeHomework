package class23Generics.generic_method;

public class GenericMethodGetMin {
	/*
	 *  if input type E will be used for comparing or some other operation 
	 *  that basic Object cannot implement, we need to explicitly declare
	 *  E extends some superclass or implements some interface  
	 */
	public static <E extends Comparable<E>> E getMin(E[] array) {
		if (array == null || array.length == 0) {
			return null;
		}
		E min = array[0];
		for (int i = 0; i <array.length; i++) {
			min = array[i].compareTo(min) < 0 ? array[i] : min;
		}
		return min;
	}
	
	/*
	 *  What really happens in java runtime is:
	 *  this is called type erasure and this
	 *  method is generated by compiler called bridge
	 *  method
	 */
//	public static Comparable getMin(Comparable[] array) {
//		if (array == null || array.length == 0) {
//			return null;
//		}
//		Comparable min = array[0];
//		for (int i = 0; i <array.length; i++) {
//			min = array[i].compareTo(min) < 0 ? array[i] : min;
//		}
//		return min;
//	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'W', 'O', 'R', 'L', 'D'};
		
		System.out.println("Array integerArray's min value is: " + getMin(intArray));
		
		
		System.out.println("Array doubleArray min value is: " + getMin(doubleArray));
		
		
		System.out.println("Array charArray min value is: " + getMin(charArray));
		
	}
}
