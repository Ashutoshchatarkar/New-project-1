
package jc;

public class arrayr {

	public static void main(String[] args) {
	
		double[] i = {1,2,3,4,5,6};
		print(i); 
		
		double[] j = new double[i.length];
		
		j= rev(i);
		print(j);
	}
	
	public static double[] rev(double[] l) {
		double[] k= l;
		
		for(int i = k.length-1; i>=0; i--) {
			System.out.println(k[i]);
		}
		return k;
 
	}
	
	public static void print(double[] k) {
		for (int i = 0; i< k.length; i++) {
			System.out.println(k[i]);
		}
	}
}