package method.java;

public class methods {

	public void multiply(int a,int b) {
		
		
		System.out.println(a*b);
			
		}
	public static void divide(int a,int b){
		System.out.println(a/b);}
	
	
	public static void add (int a,int b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
		
		//multiply(5,10);
       // multiply(10,20);
        //multiply(5,9);
        divide(33,11);
        divide(22,11);
        add(22,11);
        methods obj = new methods();
        obj.multiply(5,10);
	}
		
}
