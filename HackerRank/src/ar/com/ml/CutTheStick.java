package ar.com.ml;

import java.util.ArrayList;

/**
 * 
 * You are given N sticks, where the length of each stick is a positive integer. <br>
 * A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
 * @author Cheppak
 *
 */
public class CutTheStick {

	 public static int[] cutSticks(int[] lengths) {
		ArrayList res = new ArrayList();
	
		res.add(lengths.length);
		boolean condition = false;
		// Nos preparamos para la primer iteracion
		int min = getMin(lengths);

		while (!condition) {
			for (int i = 0; i < lengths.length; i++) {
				lengths[i] = lengths[i] - min;
			}

			min = getMin(lengths);
			// En este caso determinamos que todos los elementos del vector == 0
			if(min == 0){
				condition = true;
			}else{
				res.add(getLength(lengths));
			}
		}
		return convertArrayListToIntArray(res);
	 }
	 
	 private static int[] convertArrayListToIntArray(ArrayList arrayList){
		 int[] array = new int[arrayList.size()];
		 
		 for (int i = 0; i < arrayList.size() && (int)arrayList.get(i)>0; i++) {
			 array[i] = (int)arrayList.get(i);
		}
		 return array;
	}
		 
	 /**
	 * @return todos los elementos mayores a 0, producto de un nuevo corte
	 */
	private static int getLength(int[] lengths){
		 int lenght=0;
		 for (int i : lengths) {
			if(i>0) lenght++;
		 }
		 return lenght;
	 }
	
	/**
	 * @return Valor minimo del string. En caso de que no exista tal, devuelve 0.
	 */
	private static int getMin(int[] lengths) {
		// Tomamos como caso base un valor mayor al maximo posible (1000)
		int min = 1001;
		 for (int i : lengths) {
			if(i > 0 && i < min ){
				min = i;
			}
		 }
		return min != 1001 ? min:0;
	}	 

}
